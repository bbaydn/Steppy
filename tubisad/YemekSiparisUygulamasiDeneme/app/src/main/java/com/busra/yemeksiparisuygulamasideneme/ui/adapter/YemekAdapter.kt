package com.busra.yemeksiparisuygulamasideneme.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busra.yemeksiparisuygulamasideneme.AnasayfaFragment
import com.busra.yemeksiparisuygulamasideneme.AnasayfaFragmentDirections
import com.busra.yemeksiparisuygulamasideneme.data.entity.Yemekler
import com.busra.yemeksiparisuygulamasideneme.databinding.CardTasarimBinding

class YemekAdapter(var mContext:Context, var yemekListesi:List<Yemekler>) : RecyclerView.Adapter<YemekAdapter.CardTasarimTutucu>(){

    //Card tasarım sınıfı
    inner class CardTasarimTutucu (tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root) {
        var tasarim:CardTasarimBinding
        init{
            this.tasarim = tasarim //Shadowing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater, parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val yemek = yemekListesi.get(position)
        val hT= holder.tasarim
        hT.textViewYemekBilgi.text = "${yemek.yemekIsmi} - ${yemek.yemekUcret}"

        hT.satirCard.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.yemekDetayGecis(yemekAd = "Selam")
        }

        hT.imageViewAdd.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return yemekListesi.size
    }
}