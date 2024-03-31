package com.example.mylovefood.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mylovefood.databinding.PopularCategoryBinding
import com.example.mylovefood.model.model_random.ResultCategory
import com.example.mylovefood.model.models.MealList

class MostPopularCategory(): RecyclerView.Adapter<MostPopularCategory.PopularCategoryViewHolder>() {

    private var mealList = ArrayList<com.example.mylovefood.model.model_random.ResultCategory>()

    fun setMeals(mealList: ArrayList<com.example.mylovefood.model.model_random.ResultCategory>) {
        this.mealList = mealList
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularCategoryViewHolder {
        return PopularCategoryViewHolder(PopularCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
    return mealList.size
    }

    override fun onBindViewHolder(holder: PopularCategoryViewHolder, position: Int) {
        val imaga = mealList[position].image
        holder.binding.categoryName
    }

    class PopularCategoryViewHolder(val binding:PopularCategoryBinding): RecyclerView.ViewHolder(binding.root)
}