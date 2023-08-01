package com.busra.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.busra.calismayapisi.databinding.ActivitySonucEkraniBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_sonuc_ekrani.*

class SonucEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySonucEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySonucEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


    }

    override fun onBackPressed() {
        //super.onBackPressed()
        Snackbar.make(tasarim.textView3,"Geri dönmek istiyor musunuz?",Snackbar.LENGTH_LONG).setAction("EVET"){
            super.onBackPressed()
        }.show()
    }
}