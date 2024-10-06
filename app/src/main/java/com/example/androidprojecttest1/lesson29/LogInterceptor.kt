package com.example.androidprojecttest1.lesson29

import okhttp3.Interceptor
import okhttp3.Response

class LogInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
//        Log.d("MyNetworkLog", "-->${request.method}${request.url}")
//        Log.d("MyNetworkLog", "${request.headers}")
//        Log.d("MyNetworkLog", "${request.body}")
//        Log.d("MyNetworkLog", "-->END${request.method}")
//        val response = chain.proceed(request)
//        Log.d("MyNetworkLog", "<--${request.method}${request.url}")
//        Log.d("MyNetworkLog", "<-->END${request.method}")
//        Log.d("MyNetworkLog", "${response.body}")
//        Log.d("MyNetworkLog", "<--END${request.method}")

      // request.headers("Lang","Az")

        request.url("https://test.az/")
        return chain.proceed(request.build())
    }
}