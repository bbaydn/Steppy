package com.busra.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.busra.navigation_component.databinding.FragmentOyunEkraniBinding


class OyunEkraniFragment : Fragment() {
    private lateinit var tasarim:FragmentOyunEkraniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false)

        val bundle:OyunEkraniFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenMedeniDurum = bundle.bekar

        tasarim.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonecEkraninaGecis)
        }




        return tasarim.root
    }

}