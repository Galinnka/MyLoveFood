package com.example.mylovefood.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mylovefood.adapters.FavoriteMealsAdapter
import com.example.mylovefood.databinding.FragmentSearchBinding
import com.example.mylovefood.mvvm.RecipeViewModel


class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private lateinit var viewModel: RecipeViewModel
    private lateinit var searchRecyclerViewAdapter: FavoriteMealsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this)[RecipeViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        prepareRecyclerView()

        binding.imgSearchArrow.setOnClickListener{
            searchRecipes()
        }

        observeSearchRecipeLiveData()
    }

    private fun observeSearchRecipeLiveData() {
        viewModel.observeSerchRecipeLiveData().observe(viewLifecycleOwner, Observer {
            recipeList ->
            searchRecyclerViewAdapter.differ.submitList(recipeList)
        })
    }

    private fun searchRecipes() {
        val searchQuery = binding.edSearchBox.text.toString()
        if (searchQuery.isNotEmpty())
            viewModel.getSearchRecipes()
    }

    private fun prepareRecyclerView() {
        searchRecyclerViewAdapter = FavoriteMealsAdapter()
        binding.recSearch.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = searchRecyclerViewAdapter
        }
    }

}