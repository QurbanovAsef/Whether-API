package com.example.androidprojecttest1.lesson28_2


import com.example.androidprojecttest1.lesson27.ApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PostApiManager {
    private var okHttpClient = OkHttpClient.Builder()
//        .addInterceptor(LogInterceptor())
        .addInterceptor(HttpLoggingInterceptor().apply {
            level=HttpLoggingInterceptor.Level.BODY
        })
        .build()

    private var client: Retrofit = Retrofit.Builder()
        .baseUrl("https://cat-fact.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
    fun getApiService(): ApiService {
        return client.create(ApiService::class.java)
    }
    fun getPostApiService(): PostApiService {
        return client.create(PostApiService::class.java)
    }
}