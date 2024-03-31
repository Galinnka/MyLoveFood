package com.example.mylovefood.model.model_random


import com.google.gson.annotations.SerializedName

data class ResultCategory(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("imageType")
    val imageType: String,
    @SerializedName("title")
    val title: String
)