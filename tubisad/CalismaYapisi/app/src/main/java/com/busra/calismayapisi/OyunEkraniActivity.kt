package com.busra.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.busra.calismayapisi.databinding.ActivityOyunEkraniBinding
import com.google.android.material.snackbar.Snackbar

class OyunEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityOyunEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0)
        val gelenBekar = intent.getBooleanExtra("bekar",false)

        Log.e("Gelen Ad",gelenAd!!)
        Log.e("Gelen Yas",gelenYas.toString())
        Log.e("Gelen Boy",gelenBoy.toString())
        Log.e("Gelen Bekar",gelenBekar.toString())

        val gelenNesne = intent.getSerializableExtra("nesne") as Kisiler
        Log.e("Gelen Nesne Ad",gelenNesne.ad)
        Log.e("Gelen Nesne Yas",gelenNesne.yas.toString())
        Log.e("Gelen Nesne Boy",gelenNesne.boy.toString())
        Log.e("Gelen Nesne Bekar",gelenNesne.bekar.toString())

        tasarim.buttonBitir.setOnClickListener {
        //    Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this@OyunEkraniActivity,SonucEkraniActivity::class.java)
            startActivity(intent)
            finish() //Bulunduğum activity'yi backstack'ten sil anlamına gelir

        }
    }
}