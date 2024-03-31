package com.example.mylovefood.model.models


import com.google.gson.annotations.SerializedName

data class Measures(
    @SerializedName("metric")
    val metric: com.example.mylovefood.model.models.Metric,
    @SerializedName("us")
    val us: com.example.mylovefood.model.models.Us
)