package com.example.androidprojecttest1.weatherApi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidprojecttest1.weatherApi.fragment2.ApiResult
import com.example.androidprojecttest1.weatherApi.fragment2.ApiState
import com.example.androidprojecttest1.weatherApi.fragment2.apiCall
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherApiService: WeatherApiService
) : ViewModel() {

    private val _weatherResponseLiveData: MutableLiveData<ApiState> = MutableLiveData<ApiState>()
    val weatherResponseLiveData: LiveData<ApiState> = _weatherResponseLiveData

    fun fetchWeatherData(cityName: String) {
        _weatherResponseLiveData.value = ApiState.Loading

        viewModelScope.launch {
            val result = apiCall { weatherApiService.getWeatherForecastNew(cityName) }
            when (result) {
                is ApiResult.Success -> {
                    _weatherResponseLiveData.value = ApiState.Success(data = result.data)
                }
                is ApiResult.Error -> {
                    _weatherResponseLiveData.value =
                        ApiState.Error(result.error?.errorDescription)
                }
            }
        }
    }
}
