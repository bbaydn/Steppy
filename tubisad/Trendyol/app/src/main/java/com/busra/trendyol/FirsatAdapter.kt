package com.busra.trendyol

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busra.trendyol.databinding.FirsatBinding

class FirsatAdapter(var fContext: Context, var firsatListesi: List<Firsatlar>):
    RecyclerView.Adapter<FirsatAdapter.FirsatViewHolder>(){
    inner class FirsatViewHolder(binding: FirsatBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding : FirsatBinding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirsatViewHolder {
        val inflater = LayoutInflater.from(fContext)
        val binding = FirsatBinding.inflate(inflater, parent,false)
        return FirsatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FirsatViewHolder, position: Int) {
        val firsat = firsatListesi.get(position)
        val b = holder.binding
        b.imageView.setImageResource(firsat.gorsel)
        b.imageView.setImageLevel(500)


    }

    override fun getItemCount(): Int {
        return firsatListesi.size
    }
}