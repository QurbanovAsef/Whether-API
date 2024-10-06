package com.example.androidprojecttest1.weatherApi.fragment2

import com.example.androidprojecttest1.weatherApi.ErrorModel
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import retrofit2.Response

 suspend fun <T> apiCall(call: suspend () -> Response<T>): ApiResult<T> {
     val result = withContext(Dispatchers.IO){
         call.invoke()
     }
     return try {
         if (result.isSuccessful) {
             ApiResult.Success(result.body())
         } else {
             val gson = Gson()
             val jsonObject = JSONObject(result.errorBody()?.charStream()?.readText())
             val error = gson.fromJson(jsonObject.toString(), ErrorModel::class.java)
             ApiResult.Error(error)
         }
     } catch (e: Exception) {
         e.printStackTrace()
         ApiResult.Error(
             ErrorModel(
                 errorCode = 505,
                 errorTittle = "API Error",
                 errorDescription = e.message,
                 errorAction = "Retry"
             )
         )
     }
 }