package com.example.androidprojecttest1.lesson28_2

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.HTTP
import retrofit2.http.POST
import retrofit2.http.Path

interface PostApiService {
    @POST("posts")
    fun createPost(@Body requestBody: CreatePostModel): retrofit2.Call<CreatePostResponse>

    @HTTP(
        method = "DELETE",
        path = "posts",
        hasBody = true
    )
    suspend fun deletePost(
        @Body requestBody: CreatePostModel
    ): retrofit2.Call<CreatePostResponse>

    @DELETE("posts")
    suspend fun deletePost2():retrofit2.Call<CreatePostResponse>

    @DELETE("posts/{id}")
    suspend fun deletePost3(@Path("id") postId:Int):retrofit2.Call<CreatePostResponse>
}