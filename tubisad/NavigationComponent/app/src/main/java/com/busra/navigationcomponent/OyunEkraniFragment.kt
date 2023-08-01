package com.busra.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.busra.navigationcomponent.databinding.FragmentOyunEkraniBinding


class OyunEkraniFragment : Fragment() {
    private lateinit var tasarim:FragmentOyunEkraniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentOyunEkraniBinding.inflate(inflater,container,false)

        val bundle:OyunEkraniFragmentArgs by navArgs() //Delegate
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekar = bundle.bekar

        Log.e("Gelen Ad",gelenAd)
        Log.e("Gelen Yas",gelenYas.toString())
        Log.e("Gelen Boy",gelenBoy.toString())
        Log.e("Gelen Bekar",gelenBekar.toString())

        val gelenNesne = bundle.nesne

        Log.e("Gelen Nesne Ad",gelenNesne.ad)
        Log.e("Gelen Nesne Yas",gelenNesne.yas.toString())
        Log.e("Gelen Nesne Boy",gelenNesne.boy.toString())
        Log.e("Gelen Nesne Bekar",gelenNesne.bekar.toString())

        tasarim.buttonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraninaGecis)
        }



        return tasarim.root
    }
}