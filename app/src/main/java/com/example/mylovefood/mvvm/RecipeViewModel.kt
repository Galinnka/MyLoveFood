package com.example.mylovefood.mvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mylovefood.model.model_random.MealRandom
import com.example.mylovefood.model.model_random.Recipe
import com.example.mylovefood.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipeViewModel(): ViewModel() {
    private var randomMealLiveData = MutableLiveData<com.example.mylovefood.model.model_random.Recipe>()
    private val searchRecipeLiveData = MutableLiveData<List<Recipe>>()

    fun getRandomMeal() {
        RetrofitInstance.api.getRandomMeal(apiKey = "24a1a4d59a1449bfb51a9026344bbc45", 5).enqueue(object :
            Callback<com.example.mylovefood.model.model_random.MealRandom> {
            override fun onResponse(call: Call<com.example.mylovefood.model.model_random.MealRandom>, response: Response<com.example.mylovefood.model.model_random.MealRandom>) {
                if (response.body() !=null){
                    val randomMeal: com.example.mylovefood.model.model_random.Recipe = response.body()!!.recipes[0]
                    randomMealLiveData.value = randomMeal
                    //test по id  названию
                    Log.d("TEST", "meal id ${randomMeal.id} name ${randomMeal.title}")
                }else{
                    return
                }
            }
            override fun onFailure(call: Call<com.example.mylovefood.model.model_random.MealRandom>, t: Throwable) {
                Log.d("RecipeFragment", t.message.toString())
            }

        })
    }

    fun getSearchRecipes() {
        RetrofitInstance.api.getSearchRecipes("").enqueue(object :
            Callback<com.example.mylovefood.model.model_random.MealRandom> {
            override fun onResponse(call: Call<com.example.mylovefood.model.model_random.MealRandom>, response: Response<com.example.mylovefood.model.model_random.MealRandom>) {

                if (response.body() != null) {
                    val randomMeal =
                        response.body()!!.recipes[0]
                    searchRecipeLiveData.value = randomMeal
                    //test по id  названию
                    Log.d("TEST2", "meal id ${randomMeal.id} name ${randomMeal.title}")
                } else {
                    return
                }
            }

            override fun onFailure(call: Call<com.example.mylovefood.model.model_random.MealRandom>, t: Throwable) {
                Log.e("RecipeViewModel", t.message.toString())
            }


        })
    }


   /* fun searchRecipe(searchQuery: String) = RetrofitInstance.api.getSearchRecipes(searchQuery).enqueue(
        object : Callback<MealRandom> {
            override fun onResponse(call: Call<MealRandom>, response: Response<MealRandom>) {
                val recipeList = response.body()?.recipes
                recipeList?.let {
                    searchRecipeLiveData.postValue(it)
                }
            }

            override fun onFailure(call: Call<MealRandom>, t: Throwable) {
               Log.e("RecipeViewModel", t.message.toString())
            }


        }
    )*/

    //поиск списка блюд в режиме реального времени
    fun observeSerchRecipeLiveData(): LiveData<List<Recipe>> = searchRecipeLiveData
    fun observeRandomMealLiveData():LiveData<com.example.mylovefood.model.model_random.Recipe> {
        return randomMealLiveData
    }
}