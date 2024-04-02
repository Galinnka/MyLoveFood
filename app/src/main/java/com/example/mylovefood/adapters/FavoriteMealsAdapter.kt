package com.example.mylovefood.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mylovefood.databinding.RecipesRowLayoutBinding
import com.example.mylovefood.model.model_random.Recipe

class FavoriteMealsAdapter : RecyclerView.Adapter<FavoriteMealsAdapter.FavoriteMealsAdapterViewHolder>() {

    inner class FavoriteMealsAdapterViewHolder(val binding:RecipesRowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    private val diffUtil = object : DiffUtil.ItemCallback<Recipe>() {
        //функция сравнит старый элемент и новый
        override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
            return oldItem.id == newItem.id
        }


        //функция сравнивает весь объукт целиком
        override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this, diffUtil)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FavoriteMealsAdapterViewHolder {
        return FavoriteMealsAdapterViewHolder(
            RecipesRowLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: FavoriteMealsAdapterViewHolder, position: Int) {
        val recipe = differ.currentList[position]
        //Glide.with(holder.itemView).load(recipe.image).into(holder.binding.receiptImageView)
        holder.binding.nameReceipt.text = recipe.title
    }
}