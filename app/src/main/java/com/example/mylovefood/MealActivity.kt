package com.example.mylovefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.mylovefood.databinding.ActivityMealBinding
import com.example.mylovefood.fragments.RecipeFragment

class MealActivity : AppCompatActivity() {
    private lateinit var mealId: String
    private lateinit var mealName: String
    private lateinit var mealThumb: String
   // private lateinit var mealInstr: String
    private lateinit var binding : ActivityMealBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMealBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getMealInformationFromIntent()

         setInformationInViews()
    }

    private fun setInformationInViews() {
        Glide.with(applicationContext)
            .load(mealThumb)
            .into(binding.imgDetailRecipe)

        //binding.titleRecipe.text = mealName
        binding.collapsingToolbar.title = mealName
        binding.collapsingToolbar.setCollapsedTitleTextColor(resources.getColor(R.color.white))
        binding.collapsingToolbar.setExpandedTitleColor(resources.getColor(R.color.white))

       // binding.tvTextRecipe.text = mealInstr
    }

    private fun getMealInformationFromIntent() {
        val intent = intent
       /* mealId = intent.getStringExtra(RecipeFragment.MEAL_ID)!!*/
         mealName = intent.getStringExtra(RecipeFragment.MEAL_NAME)!!
         mealThumb = intent.getStringExtra(RecipeFragment.MEAL_THUMB)!!
        // mealInstr = intent.getStringExtra(RecipeFragment.MEAL_INSTR)!!
    }
}