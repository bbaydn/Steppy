package com.example.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding

class KisiDetayFragment : Fragment() {
    private lateinit var tasarim:FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentKisiDetayBinding.inflate(inflater, container, false)

        tasarim.toolbarKisiDetay.title = "Kişi Detay"

        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi

        tasarim.editTextKisiAd.setText(gelenKisi.kisi_ad)
        tasarim.editTextKisiTel.setText(gelenKisi.kisi_tel)

        tasarim.buttonGuncelle.setOnClickListener {
            val kisi_ad = tasarim.editTextKisiAd.text.toString()
            val kisi_tel = tasarim.editTextKisiTel.text.toString()

            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)
        }

        return tasarim.root
    }

    fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")
    }
}