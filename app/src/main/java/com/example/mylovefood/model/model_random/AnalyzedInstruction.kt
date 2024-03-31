package com.example.mylovefood.model.model_random


import com.google.gson.annotations.SerializedName

data class AnalyzedInstruction(
    @SerializedName("name")
    val name: String,
    @SerializedName("steps")
    val steps: List<com.example.mylovefood.model.model_random.Step>
)