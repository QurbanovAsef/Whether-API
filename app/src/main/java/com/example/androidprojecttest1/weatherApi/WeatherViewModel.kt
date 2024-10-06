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

//    private val retrofitService: WeatherApiService = WeatherApiManager.getWeatherApiService()

    fun fetchWeatherData(cityName: String) {
        _weatherResponseLiveData.value = ApiState.Loading

        viewModelScope.launch {
            val result =
                apiCall { weatherApiService.getWeatherForecastNew(cityName) }
            when (result) {
                is ApiResult.Success -> {
                    // _weatherResponseLiveData.value = ApiState.Loading(false)
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

//        retrofitService.getWeatherForecast(apiKey, cityName).execute()
//        retrofitService.getWeatherForecast(apiKey, cityName).enqueue(object :
//        Callback<WeatherResponse> {
//        override fun onResponse(
//        call: Call<WeatherResponse>,
//        response: Response<WeatherResponse>
//            ) {
//                if (response.isSuccessful) {
//                    _weatherResponseLiveData.value = ApiState.Success(data = response.body())
//                } else {
//                    _weatherResponseLiveData.value = ApiState.Error(errorMessage = "Xəta baş verdi")
//                }
//                _weatherResponseLiveData.value = ApiState.Loading
//            }
//
//            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
//                _weatherResponseLiveData.value = ApiState.Error(errorMessage = t.localizedMessage)
//                _weatherResponseLiveData.value = ApiState.Loading
//            }
//        })