package com.example.mylovefood.fragments

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.mylovefood.R
import com.example.mylovefood.databinding.FragmentDetailRecipeBinding
import com.example.mylovefood.util.Const

class DetailRecipeFragment : Fragment() {
 private lateinit var binding: FragmentDetailRecipeBinding
 private val args by navArgs<DetailRecipeFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailRecipeBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = args.ArgTitleRecipe
        val iimg = args.ArgImg
        val descc = args.DescriptionArgs
        /*val min = args.
        val pers = args.*/
        binding.collapsingToolbar.title = text
        binding.collapsingToolbar.setCollapsedTitleTextColor(resources.getColor(R.color.white))
        binding.collapsingToolbar.setExpandedTitleColor(resources.getColor(R.color.white))
        //binding.titleRecipe.text = text
        Glide.with(this)
            .load(iimg)
            .into(binding.imgDetailRecipe)
        binding.tvTextRecipe.setText(Html.fromHtml(Html.fromHtml(descc).toString()))

    }
}