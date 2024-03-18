package com.example.mylovefood.retrofit

import com.example.mylovefood.model_random.MealRandom
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import java.time.temporal.TemporalQueries

interface MealApi {
    @GET("recipes/random")
    fun getRandomMeal(
        @Query("apiKey") apiKey: String,
        @Query("number") number: Int
    ): Call<MealRandom>
}