package com.example.androidprojecttest1.weatherApi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.androidprojecttest1.databinding.FragmentWeatherBinding
import com.example.androidprojecttest1.weatherApi.fragment2.ApiState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherFragment : Fragment() {

    private lateinit var binding: FragmentWeatherBinding
    private val viewModel by viewModels<WeatherViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchWeatherData(cityName = "Baku")
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.fetchWeatherData(cityName = "Baku")
        }
        viewModel.weatherResponseLiveData.observe(viewLifecycleOwner, Observer { state ->
            binding.swipeRefreshLayout.isRefreshing = false
            when (state) {
                is ApiState.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is ApiState.Success -> {
                    binding.progressBar.visibility = View.GONE
                    state.data?.let {
                        binding.cityName.text = it.location?.name
                        binding.currentTemperature.text = "${it.current?.temp_c}°C"
                        binding.weatherCondition.text = it.current?.condition?.text
                        binding.tempF.text = "${it.current?.temp_f}°F"
                        binding.tempC.text = "${it.current?.temp_c}°C"
                    }
                }
                is ApiState.Error -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(
                        requireContext(),
                        "Xəta: ${state.errorMessage}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(requireContext(), "Gözlənilməz xəta", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}
