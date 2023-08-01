package com.busra.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.navigation_component.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.button.setOnClickListener {

            val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis(ad="Ali", yas=26,boy=1.75f,bekar = false)

            Navigation.findNavController(it).navigate(R.id.oyunEkraninaGecis)

        }

        return tasarim.root
    }

}