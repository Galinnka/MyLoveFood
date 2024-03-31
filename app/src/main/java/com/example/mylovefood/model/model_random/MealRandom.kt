package com.example.mylovefood.model.model_random


import com.google.gson.annotations.SerializedName

data class MealRandom(
    @SerializedName("recipes")
    val recipes: List<com.example.mylovefood.model.model_random.Recipe>
)