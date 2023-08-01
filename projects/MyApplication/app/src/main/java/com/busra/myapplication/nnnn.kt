package com.busra.myapplication

import java.util.*

import java.util.Scanner

//5) Kullanıcıdan bir harf girmesini isteyen ve bu harfin sesli veya sessiz harf olduğunu ekrana yazdıran bir programı nasıl yazarsınız?

fun main(){
    var scanner=Scanner(System.`in`)
    println("Bir karakter giriniz")
    var karakter=scanner.nextLine()
    if (karakter.length == 1 ) {
        val sesliHarfler = "aeıioöuü"
        if (sesliHarfler.contains(karakter)) {
            println("$karakter bir sesli harftir.")
        } else {
            println("$karakter bir sessiz harftir.")
        }
    } else {
        println("Geçersiz giriş! Lütfen tek bir harf giriniz.")
    }
}