package com.busra.detaylirecyclerview

import java.io.Serializable

data class Filmler(var filmId:Int,
                   var filmAdi:String,
                   var filmResimAdi:String,
                   var filmYili:Int,
                   var filmFiyat:Double,
                   var filmYonetmen:String) : Serializable {

}