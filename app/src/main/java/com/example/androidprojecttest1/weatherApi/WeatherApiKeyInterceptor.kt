package com.example.androidprojecttest1.weatherApi

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class WeatherApiKeyInterceptor @Inject constructor() : Interceptor {
    private val key = "348e4e683af14473bdf212954240709"
    private val lang = "en"

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
        val newUrl = "${chain.request().url}&lang=$lang&key=$key"
        request.url(newUrl)
        return chain.proceed((request.build()))
    }


}