package com.busra.starvy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.busra.starvy.R
import com.busra.starvy.adapter.YemekAdapter
import com.busra.starvy.data.Yemekler
import com.busra.starvy.databinding.FragmentYemekDetayBinding


class YemekDetayFragment : Fragment(), View.OnClickListener {



    private lateinit var tasarim:FragmentYemekDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentYemekDetayBinding.inflate(inflater,container,false)

        val bundle:YemekDetayFragmentArgs by navArgs()
        val gelenYemek = bundle.yemek





        return tasarim.root
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


}