package com.busra.eflag.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.busra.eflag.R
import com.busra.eflag.databinding.FragmentResultBinding


class ResultFragment : Fragment() {

    private lateinit var binding : FragmentResultBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentResultBinding.inflate(layoutInflater, container, false)
        finishTheTest()

        // Geri tuşunu dinleyen bir onBackPressedCallback oluşturuyoruz
        val onBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Geri tuşu olayını burada engellemek istediğiniz işlemi yaparak iptal edebilirsiniz.
                // Örnek olarak, aşağıdaki satırı ekleyerek geri tuşunu iptal edebilirsiniz.
                isEnabled = false
            }
        }

        // Bu geri çağırma işlevini fragment'a bağlayın
        requireActivity().onBackPressedDispatcher.addCallback(this, onBackPressedCallback)


        return binding.root
    }

    fun finishTheTest() {
        binding.btnFinishTest.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment_to_homeFragment)
        }

    }




}