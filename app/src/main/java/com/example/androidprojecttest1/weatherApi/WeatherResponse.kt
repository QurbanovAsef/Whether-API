package com.example.androidprojecttest1.weatherApi

data class WeatherResponse(
    val location: Location,
    val current: Current,
)
data class Location(
    val name: String,
    val region: String,
    val country: String
)
data class Current(
    val temp_c: Float,
    val temp_f: Float,
    val condition: Condition
)
data class Condition(
    val text: String,
    val icon: String
)

