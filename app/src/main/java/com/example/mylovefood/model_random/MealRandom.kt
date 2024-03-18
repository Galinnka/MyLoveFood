package com.example.mylovefood.model_random


import com.google.gson.annotations.SerializedName

data class MealRandom(
    @SerializedName("recipes")
    val recipes: List<Recipe>
)