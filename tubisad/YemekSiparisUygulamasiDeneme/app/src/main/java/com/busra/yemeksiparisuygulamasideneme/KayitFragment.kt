package com.busra.yemeksiparisuygulamasideneme

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.yemeksiparisuygulamasideneme.data.entity.Kisiler
import com.busra.yemeksiparisuygulamasideneme.databinding.FragmentKayitBinding

class KayitFragment : Fragment() {
    private lateinit var tasarim:FragmentKayitBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentKayitBinding.inflate(inflater,container,false)
        tasarim.toolbarKisiKayit.title = "Kişi Kayıt"

        tasarim.buttonKayit.setOnClickListener {
            val kisi_ad = tasarim.editTextEmail.text.toString()
            val kisi_parola = tasarim.editTextParola.text.toString()

            kayit(kisi_ad,kisi_parola)

            val kisi = Kisiler("1111","22222")
            val gecis = KayitFragmentDirections.girisGecis(email = kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        tasarim.buttonGiriseDon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.girisGecis)
        }


        return tasarim.root
    }

    fun kayit(kisi_ad:String, kisi_parola:String){
        Log.e("Kişi kayıt","$kisi_ad - $kisi_parola")

    }


}