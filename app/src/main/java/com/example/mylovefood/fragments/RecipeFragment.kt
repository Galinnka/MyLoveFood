package com.example.mylovefood.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.mylovefood.R
import com.example.mylovefood.databinding.FragmentRecipeBinding
import com.example.mylovefood.model_random.MealRandom
import com.example.mylovefood.model_random.Recipe
import com.example.mylovefood.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit


class RecipeFragment : Fragment() {

    private lateinit var binding:FragmentRecipeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecipeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        RetrofitInstance.api.getRandomMeal(apiKey = "24a1a4d59a1449bfb51a9026344bbc45", 5).enqueue(object : Callback<MealRandom>{
            override fun onResponse(call: Call<MealRandom>, response: Response<MealRandom>) {
                if (response.body() !=null){
                    val randomMeal: Recipe = response.body()!!.recipes[0]
                    //test по id  названию
                    Log.d("TEST", "meal id ${randomMeal.id} name ${randomMeal.title}")
                    //вывод рандомной картинки
                    Glide.with(this@RecipeFragment)
                        .load(randomMeal.image)
                        .into(binding.imgRandomMeal)
                }else{
                    return
                }
            }

            override fun onFailure(call: Call<MealRandom>, t: Throwable) {
               Log.d("RecipeFragment", t.message.toString())
            }

        })
    }
}