package com.example.androidprojecttest1.weatherApi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("forecast.json")
     fun getWeatherForecast(
        @Query("key") apiKey: String,
        @Query("q") cityName: String,
        @Query("days") days: Int = 10,
        @Query("lang") lang:String
    ): Response<WeatherResponse>

    @GET("forecast.json")
    fun getWeatherForecastNew(
        @Query("q") cityName: String
    ): Response<WeatherResponse>

}

//Get metodda body olmur Post ,Put,Delete de olur
// Get-de Query Path ve header qosulur
// Query sual isarei ile baslayan hisse
//Body Delete,Post,Put olanda istifade edilir