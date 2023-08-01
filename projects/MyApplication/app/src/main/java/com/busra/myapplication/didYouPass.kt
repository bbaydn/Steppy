package com.busra.myapplication

import java.util.*

fun grade(grade: Int){
    if(grade >= 70) {
        println("Geçtiniz!")
    } else {
        println("Kaldınız!")
    }
}

fun main() {
    val s = Scanner(System.`in`)
    print("What is your grade: ")
    val grade = s.nextInt()
    grade(grade)
}