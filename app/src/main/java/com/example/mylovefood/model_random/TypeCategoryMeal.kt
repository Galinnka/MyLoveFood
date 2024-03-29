package com.example.mylovefood.model_random


import com.google.gson.annotations.SerializedName

data class TypeCategoryMeal(
    @SerializedName("number")
    val number: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("results")
    val results: List<ResultCategory>,
    @SerializedName("totalResults")
    val totalResults: Int
)