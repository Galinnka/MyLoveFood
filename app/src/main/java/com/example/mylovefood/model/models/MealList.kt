package com.example.mylovefood.model.models


import com.google.gson.annotations.SerializedName

data class MealList(
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int,
    @SerializedName("analyzedInstructions")
    val analyzedInstructions: List<Any>,
    @SerializedName("cheap")
    val cheap: Boolean,
    @SerializedName("cookingMinutes")
    val cookingMinutes: Int,
    @SerializedName("creditsText")
    val creditsText: String,
    @SerializedName("cuisines")
    val cuisines: List<Any>,
    @SerializedName("dairyFree")
    val dairyFree: Boolean,
    @SerializedName("diets")
    val diets: List<Any>,
    @SerializedName("dishTypes")
    val dishTypes: List<String>,
    @SerializedName("extendedIngredients")
    val extendedIngredients: List<com.example.mylovefood.model.models.ExtendedIngredient>,
    @SerializedName("gaps")
    val gaps: String,
    @SerializedName("glutenFree")
    val glutenFree: Boolean,
    @SerializedName("healthScore")
    val healthScore: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("imageType")
    val imageType: String,
    @SerializedName("instructions")
    val instructions: String,
    @SerializedName("license")
    val license: String,
    @SerializedName("lowFodmap")
    val lowFodmap: Boolean,
    @SerializedName("nutrition")
    val nutrition: com.example.mylovefood.model.models.Nutrition,
    @SerializedName("occasions")
    val occasions: List<Any>,
    @SerializedName("originalId")
    val originalId: Any,
    @SerializedName("preparationMinutes")
    val preparationMinutes: Int,
    @SerializedName("pricePerServing")
    val pricePerServing: Double,
    @SerializedName("readyInMinutes")
    val readyInMinutes: Int,
    @SerializedName("servings")
    val servings: Int,
    @SerializedName("sourceName")
    val sourceName: String,
    @SerializedName("sourceUrl")
    val sourceUrl: String,
    @SerializedName("spoonacularScore")
    val spoonacularScore: Double,
    @SerializedName("spoonacularSourceUrl")
    val spoonacularSourceUrl: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("sustainable")
    val sustainable: Boolean,
    @SerializedName("taste")
    val taste: com.example.mylovefood.model.models.Taste,
    @SerializedName("title")
    val title: String,
    @SerializedName("vegan")
    val vegan: Boolean,
    @SerializedName("vegetarian")
    val vegetarian: Boolean,
    @SerializedName("veryHealthy")
    val veryHealthy: Boolean,
    @SerializedName("veryPopular")
    val veryPopular: Boolean,
    @SerializedName("weightWatcherSmartPoints")
    val weightWatcherSmartPoints: Int,
    @SerializedName("winePairing")
    val winePairing: com.example.mylovefood.model.models.WinePairing
)