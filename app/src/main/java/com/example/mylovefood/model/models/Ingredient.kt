package com.example.mylovefood.model.models


import com.google.gson.annotations.SerializedName

data class Ingredient(
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nutrients")
    val nutrients: List<com.example.mylovefood.model.models.NutrientX>,
    @SerializedName("unit")
    val unit: String
)