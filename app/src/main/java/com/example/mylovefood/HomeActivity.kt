package com.example.mylovefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.mylovefood.databinding.ActivityHomeBinding
import com.example.mylovefood.fragments.home.CategoryFragment
import com.example.mylovefood.fragments.home.FavoritesFragment
import com.example.mylovefood.fragments.home.RecipeFragment
import com.example.mylovefood.fragments.home.personalFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(RecipeFragment())

        //запуск функции переключателя фрагментов в боттом навигации
        binding.btmNav.setOnItemReselectedListener {
            when (it.itemId) {
                R.id.RecipeFragment -> replaceFragment(RecipeFragment())
                R.id.FavoriteFragment -> replaceFragment(FavoritesFragment())
                R.id.CategoryFragment -> replaceFragment(CategoryFragment())
                R.id.PersonalFragment -> replaceFragment(personalFragment())
                else -> {

                }
            }
            true

        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.host_fragment_home, fragment)
        fragmentTransaction.commit()
    }
}