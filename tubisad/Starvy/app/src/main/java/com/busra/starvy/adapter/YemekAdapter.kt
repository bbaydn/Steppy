package com.busra.starvy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.busra.starvy.R
import com.busra.starvy.data.Yemekler
import com.busra.starvy.databinding.CardTasarimBinding
import com.google.android.material.snackbar.Snackbar

class YemekAdapter(var mContext: Context, var yemekListesi:List<Yemekler>) :
    RecyclerView.Adapter<YemekAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init{
            this.tasarim = tasarim

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)

        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val yemek = yemekListesi.get(position)
        val t = holder.tasarim

        t.imageViewYemekResim.setImageResource(mContext.resources.getIdentifier(yemek.yemekResimAdi,"drawable", mContext.packageName))
        t.textViewYemekAdi.text = yemek.yemekAdi
        t.textViewYemekUcret.text = "${yemek.yemekUcreti} ₺"
        t.textViewYemekIcindekiler.text = yemek.yemekIcindeki


        t.cardViewYemek.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.kayitGecis)
        }


        t.imageAddButton.setOnClickListener {
            Snackbar.make(it,"${yemek.yemekAdi} sepete eklendi.", Snackbar.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {


        return yemekListesi.size
    }
}