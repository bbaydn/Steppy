package com.busra.yemeksiparisuygulamasideneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.busra.yemeksiparisuygulamasideneme.data.entity.Yemekler
import com.busra.yemeksiparisuygulamasideneme.databinding.FragmentAnasayfaBinding
import com.busra.yemeksiparisuygulamasideneme.ui.adapter.YemekAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.toolbar.title = "Starvy"
 //Üst bölüme aan görseller eklenebilir
//        tasarim.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())

        val yemekListesi = ArrayList<Yemekler>()
        val y1 = Yemekler("Burger",44.0)
        val y2 = Yemekler("Pizza",132.0)
        val y3 = Yemekler("Sufle",30.0)
        yemekListesi.add(y1)
        yemekListesi.add(y2)
        yemekListesi.add(y3)

        val adapter = YemekAdapter(requireContext(),yemekListesi)
        tasarim.rv.adapter = adapter



        return tasarim.root
    }

}