package com.busra.eflag.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.busra.eflag.R
import com.busra.eflag.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)


        binding.root.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_quizFragment)
        }


        // Inflate the layout for this fragment
        return binding.root
    }


}