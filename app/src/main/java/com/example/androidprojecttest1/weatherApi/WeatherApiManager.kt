//package com.example.androidprojecttest1.weatherApi
//
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//object WeatherApiManager {
//
//    private val okHttpClient = OkHttpClient.Builder()
//        .addInterceptor(WeatherApiKeyInterceptor())
//        .addInterceptor(HttpLoggingInterceptor().apply {
//            level = HttpLoggingInterceptor.Level.BODY
//        })
//        .build()
//
//    private val retrofit = Retrofit.Builder()
//        .baseUrl("https://api.weatherapi.com/v1/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(okHttpClient)
//        .build()
//
//    fun getWeatherApiService(): WeatherApiService {
//        return retrofit.create(WeatherApiService::class.java)
//    }
//
////
////    fun getPostApiService(): PostApiService {
////        return retrofit.create(PostApiService::class.java)
////    }
////
////
////    fun getApiService(): ApiService {
////        return retrofit.create(ApiService::class.java)
////    }
//
//
//
//
//}
