package com.busra.starvy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.busra.starvy.R
import com.busra.starvy.adapter.YemekAdapter
import com.busra.starvy.data.Yemekler
import com.busra.starvy.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.toolbarAnasayfa.title = "Starvy"
        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())

        val yemekListesi = ArrayList<Yemekler>()
        val y1 = Yemekler(1,"Hamburger","burger",72.99,"Hamburger Köftesi, Yeşillik \nDomates, Soğan, Mayonez")
        val y2 = Yemekler(2,"Ayvalık Tostu","ayvalik",49.99,"Amerikan Salatası, \nSosis, Kaşar Peyniri")
        val y3 = Yemekler(3,"Pizza","pizza",219.99,"Pizza Sosu, Sucuk, \nMozarella")
        val y4 = Yemekler(4,"Sosisli","hotdog",24.99,"Ketçap, Mayonez, Hardal")
        val y5 = Yemekler(5,"Domates Çorbası","soup",29.99,"Kaşar Peyniri Rendesi")
        val y6 = Yemekler(6,"Cola","cola",14.99,"Buz")

        yemekListesi.add(y1)
        yemekListesi.add(y2)
        yemekListesi.add(y3)
        yemekListesi.add(y4)
        yemekListesi.add(y5)
        yemekListesi.add(y6)

        val adapter = YemekAdapter(requireContext(),yemekListesi)
        tasarim.rv.adapter = adapter


        return tasarim.root
    }

}