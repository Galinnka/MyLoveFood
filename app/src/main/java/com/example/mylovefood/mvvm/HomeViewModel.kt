package com.example.mylovefood.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mylovefood.model_random.ResultCategory
import com.example.mylovefood.model_random.TypeCategoryMeal
import com.example.mylovefood.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel(): ViewModel() {
    private val popularItemsLiveData = MutableLiveData<List<ResultCategory>>()
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