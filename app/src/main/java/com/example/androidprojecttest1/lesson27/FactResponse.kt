package com.example.androidprojecttest1.lesson27

import com.google.gson.annotations.SerializedName

data class FactResponse(
    @SerializedName("_id", alternate = ["id", "factsId"])
    var id: String?,
    var text: String?,
    var used: Boolean?,
    var user: User
)

data class User(
    @SerializedName("_id", alternate = ["id", "factsId"])
    var id: String?,
    var photo: String?,
    var name: UserName?
)

data class UserName(
    var first: String?,
    var last: String?
)
