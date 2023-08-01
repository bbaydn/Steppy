package com.busra.kisilerdenemesi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busra.kisilerdenemesi.R
import com.busra.kisilerdenemesi.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {

        private lateinit var tasarim:FragmentKisiDetayBinding
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
            tasarim = FragmentKisiDetayBinding.inflate(inflater, container, false)
            return tasarim.root
        }
    }