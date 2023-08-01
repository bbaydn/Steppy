package com.busra.myapplication

import java.lang.Exception
import java.util.*

fun isItSilent(n: String) : Boolean {
    if(n == "a" || n == "e" || n == "ı" || n == "i" || n == "o" || n == "ö" || n == "u" || n == "ü") {
        return false
    } else {
        return true
    }
}

fun main() {
    val s = Scanner(System.`in`)
    print("Write a letter: ")
    try {
        val aLetter = s.next()
        if(isItSilent(aLetter)) {
            println("Your letter is silent.")
        } else {
            println("Your letter is not silent.")
        }

    } catch (ex: Exception) {
        println("you should write a letter! $ex")
    }
}