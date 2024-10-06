package com.example.androidprojecttest1.lesson27

import com.google.gson.annotations.SerializedName


data class FactsResponse(
    @SerializedName("_id", alternate = ["id","factsId"])
    var id: String?,
    var user: String?,
    var text: String?,
    var used: Boolean?
)

