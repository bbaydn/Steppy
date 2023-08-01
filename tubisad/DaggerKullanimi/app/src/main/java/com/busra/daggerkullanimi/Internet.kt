package com.busra.daggerkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adres: Adres) {
    fun basvuruYap(){

        Log.e("Sonuç","İnternet başvurusu ${adres.adresBilgisi} adresi için yapıldı.")

    }
}