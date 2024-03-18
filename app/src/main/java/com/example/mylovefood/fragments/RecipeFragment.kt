package com.example.mylovefood.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.mylovefood.R
import com.example.mylovefood.databinding.FragmentRecipeBinding
import com.example.mylovefood.model_random.MealRandom
import com.example.mylovefood.model_random.Recipe
import com.example.mylovefood.mvvm.RecipeViewModel
import com.example.mylovefood.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit


class RecipeFragment : Fragment() {

    private lateinit var binding:FragmentRecipeBinding
    private lateinit var recipeMvvm:RecipeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipeMvvm = ViewModelProviders.of(this)[RecipeViewModel::class.java]
    }
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

        recipeMvvm.getRandomMeal()
        observerRandomMeal()

    }
    //прослушиваем случайное изображение в режиме реального времени
    private fun observerRandomMeal() {
        recipeMvvm.observeRandomMealLiveData().observe(viewLifecycleOwner, object : Observer<Recipe>{
            override fun onChanged(value: Recipe) {
                Glide.with(this@RecipeFragment)
                    .load(value!!.image)
                    .into(binding.imgRandomMeal)
            }

        })
    }
}