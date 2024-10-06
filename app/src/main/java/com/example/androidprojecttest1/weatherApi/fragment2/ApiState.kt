package com.example.androidprojecttest1.weatherApi.fragment2

import com.example.androidprojecttest1.weatherApi.WeatherResponse

sealed class ApiState {
    data class Success(val data: WeatherResponse?): ApiState()
    data class Error(val errorMessage: String?): ApiState()
    object Loading : ApiState()
}
