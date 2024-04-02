package com.example.mylovefood.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mylovefood.R
import dagger.Lazy

class CategoryHorisontal_RecView: RecyclerView.Adapter<CategoryHorisontal_RecView.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 25
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}