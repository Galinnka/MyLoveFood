package com.example.mylovefood.model.model_random


import com.google.gson.annotations.SerializedName

data class ExtendedIngredient(
    @SerializedName("aisle")
    val aisle: String,
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("consistency")
    val consistency: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("measures")
    val measures: com.example.mylovefood.model.model_random.Measures,
    @SerializedName("meta")
    val meta: List<String>,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameClean")
    val nameClean: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("originalName")
    val originalName: String,
    @SerializedName("unit")
    val unit: String
)