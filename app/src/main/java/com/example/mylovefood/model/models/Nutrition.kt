package com.example.mylovefood.model.models


import com.google.gson.annotations.SerializedName

data class Nutrition(
    @SerializedName("caloricBreakdown")
    val caloricBreakdown: com.example.mylovefood.model.models.CaloricBreakdown,
    @SerializedName("flavonoids")
    val flavonoids: List<com.example.mylovefood.model.models.Flavonoid>,
    @SerializedName("ingredients")
    val ingredients: List<com.example.mylovefood.model.models.Ingredient>,
    @SerializedName("nutrients")
    val nutrients: List<com.example.mylovefood.model.models.NutrientX>,
    @SerializedName("properties")
    val properties: List<com.example.mylovefood.model.models.Property>,
    @SerializedName("weightPerServing")
    val weightPerServing: com.example.mylovefood.model.models.WeightPerServing
)