package com.busra.homeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.homeworkfour.databinding.FragmentAnasayfaBinding
import com.busra.homeworkfour.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {

    private lateinit var tasarim:FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)

        tasarim.butonbdenyye.setOnClickListener {
            Navigation.findNavController(tasarim.butonbdenyye).navigate(R.id.bdenYyeGecis)
        }

        return tasarim.root
    }

}