package com.example.androidprojecttest1.test

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Telefon nömrəsi daxil edildikdən sonra zəng etmək üçün
        binding.phoneNumberInput.setOnClickListener {
            val phoneNumber = binding.phoneNumberInput1.text.toString()
            if (phoneNumber.isNotEmpty()) {
                dial(phoneNumber)
            }
        }
    }

    private fun dial(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(intent)
    }
}
//package com.example.androidprojecttest1.weatherApi.fragment2
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.androidprojecttest1.databinding.ItemForecastBinding
//
//class ForecastAdapter(
//    private var forecastList: List<ForecastDay> = emptyList()
//) : RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>() {
//
//    fun updateData(newList: List<ForecastDay>) {
//        forecastList = newList
//        notifyDataSetChanged()
//    }
//
//    inner class ForecastViewHolder(private val binding: ItemForecastBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        fun bind(forecastDay: ForecastDay) {
//            binding.date.text = forecastDay.date
//            binding.temperature.text = "${forecastDay.day.maxtemp_c}°C / ${forecastDay.day.mintemp_c}°C"
//            // hava ikonunu təyin edin
//            // binding.weatherIcon.setImageResource(R.drawable.ic_weather) // Şəkil resursu burada uyğunlaşdırın
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = ItemForecastBinding.inflate(inflater, parent, false)
//        return ForecastViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
//        holder.bind(forecastList[position])
//    }
//
//    override fun getItemCount(): Int {
//        return forecastList.size
//    }
//}

//package com.example.androidprojecttest1.weatherApi.fragment2
//
//// WeatherResponse modelini JSON strukturu ilə uyğunlaşdırın
//data class WeatherResponse(
//    val location: Location,
//    val current: Current,
//    val forecast: Forecast
//)
//
//// Forecast modelini JSON strukturu ilə uyğunlaşdırın
//data class Forecast(
//    val forecastday: List<ForecastDay>
//)
//
//// ForecastDay modelini JSON strukturu ilə uyğunlaşdırın
//data class ForecastDay(
//    val date: String,
//    val day: Day
//)
//
//// Day modelini JSON strukturu ilə uyğunlaşdırın
//data class Day(
//    val maxtemp_c: Float,
//    val mintemp_c: Float,
//    val condition: Condition
//)
//
//// Condition modelini JSON strukturu ilə uyğunlaşdırın
//data class Condition(
//    val text: String,
//    val icon: String, // icon şəkil URL-i
//    val code: Int
//)
//
//// Location modelini JSON strukturu ilə uyğunlaşdırın
//data class Location(
//    val name: String,
//    val region: String,
//    val country: String,
//    val lat: Float,
//    val lon: Float,
//    val tz_id: String,
//    val localtime_epoch: Long,
//    val localtime: String
//)
//
//// Current modelini JSON strukturu ilə uyğunlaşdırın
//data class Current(
//    val last_updated_epoch: Long,
//    val last_updated: String,
//    val temp_c: Float,
//    val temp_f: Float,
//    val is_day: Int,
//    val condition: Condition,
//    val wind_mph: Float,
//    val wind_kph: Float,
//    val wind_degree: Int,
//    val wind_dir: String,
//    val pressure_mb: Float,
//    val pressure_in: Float,
//    val precip_mm: Float,
//    val precip_in: Float,
//    val humidity: Int,
//    val cloud: Int,
//    val feelslike_c: Float,
//    val feelslike_f: Float,
//    val vis_km: Float,
//    val vis_miles: Float,
//    val uv: Float,
//    val gust_mph: Float,
//    val gust_kph: Float,
//    val air_quality: AirQuality
//)
//
//// AirQuality modelini JSON strukturu ilə uyğunlaşdırın
//data class AirQuality(
//    val co: Float,
//    val no2: Float,
//    val o3: Float,
//    val so2: Float,
//    val pm2_5: Float,
//    val pm10: Float,
//    val us_epa_index: Int,
//    val gb_defra_index: Int
//)

//package com.example.androidprojecttest1.weatherApi.fragment2
//
//import com.example.androidprojecttest1.weatherApi.WeatherViewModel
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.viewModels
//import androidx.lifecycle.Observer
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.androidprojecttest1.databinding.FragmentWeather2Binding
//
//class WeatherFragment_2 : Fragment() {
//    private lateinit var binding: FragmentWeather2Binding
//    private lateinit var forecastAdapter: ForecastAdapter
//    private val viewModel: com.example.androidprojecttest1.weatherApi.WeatherViewModel by viewModels()
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = FragmentWeather2Binding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.forecastRecyclerView.layoutManager = LinearLayoutManager(requireContext())
//        forecastAdapter = ForecastAdapter()
//        binding.forecastRecyclerView.adapter = forecastAdapter
//
//        val apiKey = "348e4e683af14473bdf212954240709"
//        val cityName = "Baku"
//
//        viewModel.fetchWeatherData(apiKey, cityName)
//
//        viewModel.weatherResponse.observe(viewLifecycleOwner, Observer { weatherResponse ->
//            weatherResponse?.let {
//                val forecastDays = it.forecast.forecastday // `forecastday` istifadə edin
//                forecastAdapter.updateData(forecastDays)
//
//                binding.cityName.text = it.location.name
//                binding.currentTemperature.text = "${it.current.temp_c}°C"
//                binding.weatherCondition.text = it.current.condition.text
//            }
//        })
//    }
//}