package com.example.mylovefood.model.model_random


import com.google.gson.annotations.SerializedName

data class Step(
    @SerializedName("equipment")
    val equipment: List<com.example.mylovefood.model.model_random.Equipment>,
    @SerializedName("ingredients")
    val ingredients: List<com.example.mylovefood.model.model_random.Ingredient>,
    @SerializedName("length")
    val length: com.example.mylovefood.model.model_random.Length,
    @SerializedName("number")
    val number: Int,
    @SerializedName("step")
    val step: String
)