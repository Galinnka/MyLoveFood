package com.example.mylovefood.fragments.start

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mylovefood.HomeActivity
import com.example.mylovefood.R
import com.example.mylovefood.databinding.FragmentLanguageBinding
import com.example.mylovefood.databinding.FragmentStart1Binding
import com.example.mylovefood.databinding.FragmentStart2Binding

class LanguageFragment : Fragment() {
    lateinit var binding: FragmentLanguageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLanguageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btSkip.setOnClickListener {
            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}