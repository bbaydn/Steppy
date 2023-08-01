package com.busra.widgetskullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.busra.widgetskullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        tasarim.buttonResim1.setOnClickListener {
            tasarim.imageView.setImageResource(R.drawable.resim1)
        }

        tasarim.buttonResim2.setOnClickListener {
            tasarim.imageView.setImageResource(resources.getIdentifier("resim2","drawable",packageName))
        }

        tasarim.switch2.setOnCheckedChangeListener { s, b ->
        if(b){
            Log.e("Widgets", "Switch : ON")

        }else {
            Log.e("Widgets", "Switch : OFF")
        }
        }


        tasarim.checkBoxKotlin.setOnCheckedChangeListener { c, b ->
            if(b){
                Log.e("Widgets", "Kotlin : ON")

            }else {
                Log.e("Widgets", "Kotlin : OFF")
            }
        }

        tasarim.checkBoxJava.setOnCheckedChangeListener { c, b ->
            if(b){
                Log.e("Widgets", "Java : ON")

            }else {
                Log.e("Widgets", "Java : OFF")
            }
        }

        tasarim.radioButtonBarcelona.setOnCheckedChangeListener{r, b ->
            if(b){
                Log.e("Widgets", "Barcelona : ON")
            }else{
                Log.e("Widgets","Barcelona : OFF")
            }

        }

        tasarim.radioButtonRealMadrid.setOnCheckedChangeListener{r, b ->
            if(b){
                Log.e("Widgets", "Real Madrid : ON")
            }else{
                Log.e("Widgets","Real Madrid: OFF")
            }

        }

        tasarim.buttonGoster.setOnClickListener {
            Log.e("Widgets","Switch en son durum: ${tasarim.switch2.isChecked}")
            Log.e("Widgets","Switch en son durum: ${tasarim.checkBoxKotlin.isChecked}")
            Log.e("Widgets","Switch en son durum: ${tasarim.checkBoxJava.isChecked}")
            Log.e("Widgets","Switch en son durum: ${tasarim.radioButtonBarcelona.isChecked}")
            Log.e("Widgets","Switch en son durum: ${tasarim.radioButtonRealMadrid.isChecked}")
        }
    }
}