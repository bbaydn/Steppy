package com.busra.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.navigationcomponent.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)
        tasarim.buttonBasla.setOnClickListener {

            val kisi = Kisiler("Mehmet", 28,1.68f,false)

            val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis(ad= "Ahmet", yas = 23, boy = 1.78f, bekar = true, nesne = kisi)

            Navigation.findNavController(tasarim.buttonBasla).navigate(gecis)
        }


        return tasarim.root
    }

}