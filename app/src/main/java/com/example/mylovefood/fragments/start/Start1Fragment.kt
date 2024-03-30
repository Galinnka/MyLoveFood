package com.example.mylovefood.fragments.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mylovefood.R
import com.example.mylovefood.databinding.ActivityHomeBinding
import com.example.mylovefood.databinding.FragmentStart1Binding

class Start1Fragment : Fragment() {
    lateinit var binding: FragmentStart1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStart1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btStart1.setOnClickListener {
            findNavController().navigate(R.id.action_start1Fragment_to_start2Fragment)
        }
    }
}