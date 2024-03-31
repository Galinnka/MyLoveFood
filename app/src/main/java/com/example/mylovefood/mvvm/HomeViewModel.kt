package com.example.mylovefood.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel(
    //private val mealDatabase: MealDatabase
) : ViewModel() {
    private val popularItemsLiveData = MutableLiveData<List<com.example.mylovefood.model.model_random.ResultCategory>>()
}

/*fun getPopularItems() {
RetrofitInstance.api.getPopularsCategory("dessert").enqueue(object : Callback<TypeCategoryMeal> {
    override fun onResponse(call: Call<TypeCategoryMeal>, response: Response<TypeCategoryMeal>) {
        if (response.body() !=null) {
            val popularItemsLiveData = null
            popularItemsLiveData.value = response.body()!!.meals
        }   }

    override fun onFailure(call: Call<TypeCategoryMeal>, t: Throwable) {
        Log.d("Home Fragment", t.message.toString())
    }
})
}*/