package com.busra.homeworkfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.homeworkfour.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {

    private lateinit var tasarim: FragmentSayfaXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.butonxtenyye.setOnClickListener {
            Navigation.findNavController(tasarim.butonxtenyye).navigate(R.id.xtenYyeGecis)
        }
        return tasarim.root
    }

}