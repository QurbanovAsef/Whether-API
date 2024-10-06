package com.example.androidprojecttest1.lesson28_2

import android.util.Log
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CreatePostViewModel : ViewModel() {
    fun createPost(title: String, desc: String) {

        val request = CreatePostModel(
            title = title,
            body = desc,
            userId = 1
        )

        PostApiManager.getPostApiService().createPost(request).enqueue(object :Callback<CreatePostResponse>{
            override fun onResponse(call: Call<CreatePostResponse>, response: Response<CreatePostResponse>) {
                Log.d("djdjdjdjddjj", "onResponse:${response.body()}")
            }

            override fun onFailure(call: Call<CreatePostResponse>, throwable: Throwable) {

            }

        })
    }


}