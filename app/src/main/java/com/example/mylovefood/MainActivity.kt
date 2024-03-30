package com.example.mylovefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.mylovefood.databinding.ActivityMainBinding
import com.example.mylovefood.fragments.start.Start1Fragment

// для переключения цветов кнопок боттом меню использовала селектор в дравбл

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Start1Fragment())

    }

   private fun replaceFragment(fragment: Fragment) {
       val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.host_fragment_home, fragment)
        fragmentTransaction.commit()
    }
}