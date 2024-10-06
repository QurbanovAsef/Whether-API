package com.example.androidprojecttest1.weatherApi.fragment2

import com.example.androidprojecttest1.weatherApi.ErrorModel

sealed class ApiResult<out T>{
    data class Success<T> (val data: T?): ApiResult<T>()
    data class Error(val error: ErrorModel?): ApiResult<Nothing>()

}
