package com.example.mylovefood.bindingadapters

import android.widget.TextView
import androidx.databinding.BindingAdapter

class RecipesRowBinding {

    companion object {
        @BindingAdapter("setNumberOfLikes")
        @JvmStatic
        fun setNumberOfLikes(textView: TextView, likes: Int) {
            textView.text = likes.toString()
        }

        @BindingAdapter("setNumberOfMinutes")
        @JvmStatic
        fun setNumberOfMinutes(textView: TextView, minutes: Int) {
            textView.text = minutes.toString()
        }

        @BindingAdapter("setNumberOfPerson")
        @JvmStatic
        fun setNumberOfPerson(textView: TextView, person: Int) {
            textView.text = person.toString()
        }
    }
}