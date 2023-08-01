package com.busra.starvy.data

import java.io.Serializable

data class Yemekler(var yemekId: Int,
                    var yemekAdi: String,
                    var yemekResimAdi: String,
                    var yemekUcreti: Double,
                    var yemekIcindeki: String) : Serializable {
}