package com.busra.homeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.homeworkfour.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var tasarim:FragmentSayfaABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)

        tasarim.butonbyegit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }


        return tasarim.root
    }

}