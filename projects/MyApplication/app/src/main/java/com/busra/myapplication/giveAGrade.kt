package com.busra.myapplication

import java.lang.Exception
import java.util.*

fun takeAGrade(number: Int): Boolean {

    return number in 0..100

    //if (number in 0..100) {
    //        return true
    //    } else {
    //        return false
    //    }
}

fun main() {
    val s = Scanner(System.`in`)
    print("Notunuz nedir? ")
    try {
        val number = s.nextInt()
        if(takeAGrade(number)) {
            println("Girilen değer 0 ve 100 aralığındadır.")
        } else {
            println("Hatalı bir değer girdiniz.")
        }
    } catch (ex: Exception) {
        println("Geçerli bir sayı girmelisiniz: $ex")
    }

}