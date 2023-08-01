package com.busra.yemeksiparisuygulamasideneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.busra.yemeksiparisuygulamasideneme.data.entity.Kisiler
import com.busra.yemeksiparisuygulamasideneme.databinding.FragmentGirisBinding
import com.google.android.material.snackbar.Snackbar

class GirisFragment : Fragment() {


    private lateinit var tasarim:FragmentGirisBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentGirisBinding.inflate(inflater,container,false)

        tasarim.toolbarGiris.title = "Giriş"

        val bundle:GirisFragmentArgs by navArgs()
        val gelenKisi = bundle.email

        tasarim.buttonGiris.setOnClickListener {

            Snackbar.make(it,"Giriş Başarılı",Snackbar.LENGTH_SHORT).show()
        }

        tasarim.buttonSignup.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sigupGecis)
        }




        return tasarim.root
    }

}