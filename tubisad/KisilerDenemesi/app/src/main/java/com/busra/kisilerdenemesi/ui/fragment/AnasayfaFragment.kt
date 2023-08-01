package com.busra.kisilerdenemesi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busra.kisilerdenemesi.R
import com.busra.kisilerdenemesi.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.toolbarAnasayfa.title = "KİŞİLER"

        tasarim.fab.setOnClickListener{
            Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
        }

        return tasarim.root
    }

}