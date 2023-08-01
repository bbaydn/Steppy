package com.busra.homeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.homeworkfour.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.butonayagit.setOnClickListener {
            Navigation.findNavController(tasarim.butonayagit).navigate(R.id.sayfaAGecis)
        }

        tasarim.butonxegit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBGecis)
        }


        return tasarim.root
    }
}