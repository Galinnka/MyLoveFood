package com.example.mylovefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.mylovefood.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

// для переключения цветов кнопок боттом меню использовала селектор в дравбл

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(RecipeFragment())

        //запуск функции переключателя фрагментов в боттом навигации
        binding.btmNav.setOnItemReselectedListener {
            when(it.itemId) {
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
        fragmentTransaction.replace(R.id.host_fragment, fragment)
        fragmentTransaction.commit()
    }
}