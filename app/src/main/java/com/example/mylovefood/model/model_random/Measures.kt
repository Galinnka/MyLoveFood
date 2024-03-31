package com.example.mylovefood.model.model_random


import com.google.gson.annotations.SerializedName

data class Measures(
    @SerializedName("metric")
    val metric: com.example.mylovefood.model.model_random.Metric,
    @SerializedName("us")
    val us: com.example.mylovefood.model.model_random.Us
)