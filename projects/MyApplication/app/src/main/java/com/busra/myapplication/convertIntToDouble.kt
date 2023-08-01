package com.busra.myapplication

import java.util.*

fun convertTheNumber(num: Int) {
    print("${num.toFloat()}")
}

fun main() {
    val textWithQuotes = "Bu bir \"örnek\" metindir."
    println(textWithQuotes)

    val s = Scanner(System.`in`)
    print("a number: ")
    val num = s.nextInt()
    convertTheNumber(num)
}