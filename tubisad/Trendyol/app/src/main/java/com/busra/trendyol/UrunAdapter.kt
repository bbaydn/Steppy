package com.busra.trendyol

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busra.trendyol.databinding.VeriDesignBinding

class UrunAdapter (var mContext: Context, var items: List<Urunler>) :
    RecyclerView.Adapter<UrunAdapter.VeriViewHolder>() {

    inner class VeriViewHolder(binding: VeriDesignBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding : VeriDesignBinding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VeriViewHolder {
        val inflater =LayoutInflater.from(mContext)
        val binding = VeriDesignBinding.inflate(inflater, parent,false)
        return VeriViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VeriViewHolder, position: Int) {
        val item = items[position]
        val b = holder.binding
        b.urunView.setImageResource(item.gorsel)
        b.markaText.text = item.marka
        b.isimText.text = item.isim
        b.fiyatText.text = item.fiyat.toString() + " TL"

        if (item.favoriMi) {
            b.favoriView.setImageResource(R.drawable.favori_secilmis)
        } else {
            b.favoriView.setImageResource(R.drawable.favori_secilmemis)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
}