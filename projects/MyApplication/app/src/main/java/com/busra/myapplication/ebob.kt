package com.busra.myapplication

fun findEBOB(a: Int, b: Int): Int {
    var ebob = 1
    var i = 1

    //while (i <= a && i <= b) {
    //    if (a % i == 0 && b % i == 0) {
    //        gcd = i
    //    }
    //    i++
    //}

    for(i in 1 until a + 1) {
        if(a % i == 0 && b % i == 0) {
            ebob = i
        }
    }

    return ebob
}

fun main() {
    print("Birinci sayıyı girin: ")
    val num1 = readLine()!!.toInt()

    print("İkinci sayıyı girin: ")
    val num2 = readLine()!!.toInt()

    val ebob = findEBOB(num1, num2)
    println("En büyük ortak bölen (EBOB): $ebob")
}