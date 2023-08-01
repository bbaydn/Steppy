package com.busra.myapplication

import java.math.BigInteger
import java.util.*

fun main() {
    print("Adınızı girin: ")
    val name = readLine()

    print("Yaşınızı girin: ")
    val ageStr = readLine()
    val age = ageStr?.toIntOrNull()

    if (name != null && age != null) {
        println("Merhaba, $name! $age yaşındasınız.")
    } else {
        println("Hatalı giriş yapıldı.")
    }
}














