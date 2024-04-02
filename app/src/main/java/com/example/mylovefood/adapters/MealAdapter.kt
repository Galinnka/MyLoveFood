package com.example.mylovefood.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ComputableLiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mylovefood.databinding.RecipesRowLayoutBinding
import com.example.mylovefood.model.model_random.MealRandom
import com.example.mylovefood.model.model_random.Recipe
import com.example.mylovefood.model.model_random.ResultCategory
import com.example.mylovefood.util.RecipesDiffUtil

class MealAdapter : RecyclerView.Adapter<MealAdapter.MyViewHolder>() {

    //забираем весь список полей из model_random
    private var recipesList = ArrayList<Recipe>()
    class MyViewHolder(private val binding: RecipesRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(result: Recipe) {
          /*  binding.resultFoodRecipes = result
            binding.executePendingBindings()*/
        }

        companion object
        fun from(parent: ViewGroup): MyViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = RecipesRowLayoutBinding.inflate(layoutInflater, parent, false)
            return MyViewHolder(binding)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealAdapter.MyViewHolder {
        return MyViewHolder(RecipesRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    override fun onBindViewHolder(holder: MealAdapter.MyViewHolder, position: Int) {
        val currentRecipe = recipesList[position]
        holder.bind(currentRecipe)
    }

    override fun getItemCount(): Int {
        return recipesList.size
    }

    fun addRecipe(recipe: Recipe){
        recipesList.add(recipe)
        notifyDataSetChanged()
    }


    fun setData(newData: MealRandom) {
        /*val recipesDiffUtil = RecipesDiffUtil(recipes, newData.recipes)
        val diffUtilResult = DiffUtil.calculateDiff(recipesDiffUtil)
        recipes = newData.recipes
        diffUtilResult.dispatchUpdatesTo(this)*/
    }

}