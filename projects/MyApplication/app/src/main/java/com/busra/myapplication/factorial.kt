package com.busra.myapplication

import java.math.BigInteger
import java.util.*

fun factorialBigInt(n: Int): BigInteger {
    var result = BigInteger.ONE

    for (i in 1..n) {
            result *= BigInteger.valueOf(i.toLong())
        }

    return result
}

fun factorial(n: Int): Int {
    var result = 1

    for (i in 1 until n + 1) {
        result *= i
    }

    return result
}

fun main() {
    val s = Scanner(System.`in`)
    println("Write a number: ")
    val number = s.nextLine()
    val resultBigInt = factorialBigInt(number.toInt())
    val result = factorial(number.toInt())
    println("Big int $number! = $resultBigInt")
    println("$number! = $result")
}

fun smain() {
    val s = Scanner(System.`in`)
    print("Enter a number: ")
    val number = s.nextInt()
    var result = BigInteger.ONE

    for(i in 1 until number + 1) {
        result *= BigInteger.valueOf(i.toLong())
    }

    println("$number! = $result")

}