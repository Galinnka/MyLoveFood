package com.example.mylovefood.fragments.home
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import com.example.mylovefood.R
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mylovefood.adapters.MealAdapter
import com.example.mylovefood.databinding.FragmentRecipeBinding
import com.example.mylovefood.model.model_random.Recipe
import com.example.mylovefood.mvvm.RecipeViewModel
import com.example.mylovefood.util.Const


class RecipeFragment : Fragment() {

    private lateinit var binding:FragmentRecipeBinding
    private lateinit var recipeMvvm:RecipeViewModel
    private lateinit var randomMeal: com.example.mylovefood.model.model_random.Recipe
    private lateinit var mainAdapter: MealAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var recipeArrayList: ArrayList<Recipe>

    companion object {
        const val MEAL_ID = "com.example.mylovefood.fragments.idMeal"
        const val MEAL_NAME = "com.example.mylovefood.fragments.nameMeal"
        const val MEAL_THUMB = "com.example.mylovefood.fragments.thumbMeal"
        // const val MEAL_INSTR = "com.example.mylovefood.fragments.instrMeal"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipeMvvm = ViewModelProviders.of(this)[RecipeViewModel::class.java]
        mainAdapter = MealAdapter()
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
        recipeDetailRandomBanAct()
        recipeDetailRandomBan()
        //подключаем список рецептов
        val layoutManager = LinearLayoutManager(context)
        recyclerView = binding.recPopularMeal
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        mainAdapter = MealAdapter()
        recyclerView.adapter = mainAdapter

    }

    private fun recipeDetailRandomBan() {
        binding.randomMealCard.setOnClickListener {
            recipeMvvm.observeRandomMealLiveData().observe(viewLifecycleOwner
            ) { meal ->
                val titleArg = meal.title
                val imgArg = meal.image
                val descArg = meal.summary
                val minutes = meal.cookingMinutes
                val pers = meal.servings
                Log.d("TESTT", "meal image $imgArg name $titleArg desc $descArg minutes cooking $minutes person $pers" )

                val action = RecipeFragmentDirections.actionRecipeFragmentToDetailRecipeFragment(titleArg, imgArg, descArg)

                this.randomMeal = meal
                findNavController().navigate(action)
            }

        }
    }


    //тест запуск через вторую активити - АКТИВИТИ УДАЛЕНА!!
    private fun recipeDetailRandomBanAct() {
        /*  binding.randomMealCard.setOnClickListener{
              val intent = Intent(activity,MealActivity::class.java)

              intent.putExtra(MEAL_ID,randomMeal.id)
              intent.putExtra(MEAL_NAME,randomMeal.title)
              intent.putExtra(MEAL_THUMB,randomMeal.image)
              //intent.putExtra(MEAL_INSTR,randomMeal.creditsText)
              startActivity(intent)
             //findNavController().navigate(R.id.action_recipeFragment_to_detailRecipeFragment)
          }*/

    }



    //прослушиваем случайное изображение в режиме реального времени
    private fun observerRandomMeal() {
        recipeMvvm.observeRandomMealLiveData().observe(viewLifecycleOwner
        ) { meal ->
            Glide.with(this@RecipeFragment)
                .load(meal!!.image)
                .into(binding.imgRandomMeal)
            this.randomMeal = meal

        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (childFragmentManager.backStackEntryCount > 0) {
                    childFragmentManager.popBackStack()
                } else {
                    isEnabled = false
                    activity?.onBackPressed()
                }
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
    }

}

