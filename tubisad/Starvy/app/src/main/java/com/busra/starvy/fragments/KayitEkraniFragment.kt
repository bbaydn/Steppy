package com.busra.starvy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busra.starvy.R
import com.busra.starvy.databinding.FragmentKayitEkraniBinding
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth


class KayitEkraniFragment : Fragment() {
    private lateinit var tasarim:FragmentKayitEkraniBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        tasarim = FragmentKayitEkraniBinding.inflate(inflater,container,false)

        return tasarim.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FirebaseAuth.getInstance().currentUser?.let {
            Navigation.findNavController(view).navigate(R.id.anasayfaGecis)
        }

        tasarim.tvGirisYap.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.girisGecis)
        }

        tasarim.buttonKayitOl.setOnClickListener {
            if (tasarim.editTextEmailKayit.text.toString()
                    .isNotEmpty() && tasarim.editTextParolaKayitOl.text.toString().isNotEmpty()
            ) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    tasarim.editTextEmailKayit.text.toString(),
                    tasarim.editTextParolaKayitOl.text.toString()
                ).addOnCompleteListener (object :OnCompleteListener<AuthResult>{
                    override fun onComplete(p0: Task<AuthResult>) {
                        if (p0.isSuccessful){
                            Snackbar.make(it, "Üyelik başarıyla oluşturuldu !", Snackbar.LENGTH_SHORT).show()
                            FirebaseAuth.getInstance().signOut()
                            Navigation.findNavController(it).navigate(R.id.girisGecis)



                        }else{
                            Snackbar.make(it, "Hata", Snackbar.LENGTH_SHORT).show()
                        }
                    }
                })
            } else {
                Snackbar.make(it, "Lütfen boş alanları doldurunuz", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

}