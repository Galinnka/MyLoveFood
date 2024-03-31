package com.example.mylovefood.model.models


import com.google.gson.annotations.SerializedName

data class Taste(
    @SerializedName("bitterness")
    val bitterness: Double,
    @SerializedName("fattiness")
    val fattiness: Double,
    @SerializedName("saltiness")
    val saltiness: Double,
    @SerializedName("savoriness")
    val savoriness: Double,
    @SerializedName("sourness")
    val sourness: Double,
    @SerializedName("spiciness")
    val spiciness: Double,
    @SerializedName("sweetness")
    val sweetness: Double
)