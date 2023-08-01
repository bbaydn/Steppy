package com.busra.starvy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.starvy.R
import com.busra.starvy.databinding.FragmentGirisEkraniBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth


class GirisEkraniFragment : Fragment() {

    private lateinit var tasarim:FragmentGirisEkraniBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentGirisEkraniBinding.inflate(inflater,container,false)


        return tasarim.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FirebaseAuth.getInstance().currentUser?.let {
            Navigation.findNavController(view).navigate(R.id.anasayfaGecis)
        }

        tasarim.tvUyeOl.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kayitGecis)
        }

        tasarim.buttonGirisYap.setOnClickListener {
            if (tasarim.editTextEmailGiris.text.toString().isNotEmpty() && tasarim.editTextParolaGiris.text.toString().isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    tasarim.editTextEmailGiris.text.toString(),
                    tasarim.editTextParolaGiris.text.toString()
                )
                    .addOnCompleteListener { p0 ->
                        if (p0.isSuccessful){
                            Snackbar.make(it,"Giriş başarılı", Snackbar.LENGTH_SHORT).show()
                            Navigation.findNavController(it).navigate(R.id.anasayfaGecis)
                        }
                        else{
                            Snackbar.make(it,"Giriş başarısız", Snackbar.LENGTH_SHORT).show()
                        }
                    }

            }
            else{
                Snackbar.make(it,"Email veya parola alanları boş bırakılamaz.", Snackbar.LENGTH_SHORT).show()
            }
        }
    }


}