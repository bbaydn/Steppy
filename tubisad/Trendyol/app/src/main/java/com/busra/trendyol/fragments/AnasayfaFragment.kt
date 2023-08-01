package com.busra.trendyol.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busra.trendyol.*
import com.busra.trendyol.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container, false)


        val urunList = ArrayList<Urunler>()
        val urun1 = Urunler("TRENDYOLMILLA","Yüksek Bel Pantolon",199.99,R.drawable.pantolonsiyahh, true)
        val urun2 = Urunler("TRENDYOLMILLA","Siyah Örme Elbise",151.99,R.drawable.elbisesiyahh,false)
        val urun3 = Urunler("TRENDYOLMILLA","Beyaz Boyfriend Gömlek",159.99,R.drawable.gomlekbeyaz,false)
        val urun4 = Urunler("APPLE","iPhone 11 64GB",13719.02,R.drawable.iphonegreyy,false)
        val urun5 = Urunler("JBL","Kulakiçi Kulaklık",671.04,R.drawable.kulaklik,false)

        urunList.add(urun1)
        urunList.add(urun2)
        urunList.add(urun3)
        urunList.add(urun4)
        urunList.add(urun5)

        val firsatList = ArrayList<Firsatlar>()
        val firsat1 = Firsatlar(R.drawable.firsatt)
        val firsat2 = Firsatlar(R.drawable.firsatiki)
        val firsat3 = Firsatlar(R.drawable.firsatuc)
        val firsat4 = Firsatlar(R.drawable.firsatdort)

        firsatList.add(firsat1)
        firsatList.add(firsat2)
        firsatList.add(firsat3)
        firsatList.add(firsat4)



        binding.rvItems.adapter = UrunAdapter(requireContext(), urunList)
        binding.rvItems.setHasFixedSize(true)



        binding.firsatItems.adapter = FirsatAdapter(requireContext(), firsatList)
        binding.firsatItems.setHasFixedSize(true)
        val otherLayoutManager = androidx.recyclerview.widget.StaggeredGridLayoutManager(1,androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL)
        binding.firsatItems.layoutManager = otherLayoutManager
        binding.firsatItems.setHasFixedSize(true)

        val layoutManager = androidx.recyclerview.widget.StaggeredGridLayoutManager(1, androidx.recyclerview.widget.StaggeredGridLayoutManager.HORIZONTAL)
        binding.rvItems.layoutManager = layoutManager



        return binding.root
    }

}