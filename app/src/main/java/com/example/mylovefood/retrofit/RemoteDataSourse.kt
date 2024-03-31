package com.example.mylovefood.retrofit

import com.example.mylovefood.model.model_random.MealRandom
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSourse @Inject constructor(
    private val mealApi: MealApi
) {
    suspend fun getRecipes(queries: Map<String, String>) : Response<MealRandom> {
        return mealApi.getRecipes(queries)
    }
}