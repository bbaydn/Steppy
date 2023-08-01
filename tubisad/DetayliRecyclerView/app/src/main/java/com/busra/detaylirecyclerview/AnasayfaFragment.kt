package com.busra.detaylirecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.busra.detaylirecyclerview.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.toolbarAnasayfa.title = "Filmler"
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"Anadoluda","anadoluda", 2008,7.0,"Nuri Bilge Ceylan")
        val f2 = Filmler(1,"Django","django", 2010,10.0,"Quentin Tarantino")
        val f3 = Filmler(1,"Inception","inception", 2003,14.0,"Christopher Nolan")
        val f4 = Filmler(1,"Interstellar","interstellar", 2011,12.0,"Christopher Nolan")
        val f5 = Filmler(1,"The Hateful Eight","thehatefuleight", 2009,17.0,"Quentin Tarantino")
        val f6 = Filmler(1,"The Pianist","thepianist", 2001,10.0,"Roman Polonski")
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val adapter = FilmlerAdapter(requireContext(),filmlerListesi)
        tasarim.rv.adapter = adapter




        return tasarim.root
    }

}