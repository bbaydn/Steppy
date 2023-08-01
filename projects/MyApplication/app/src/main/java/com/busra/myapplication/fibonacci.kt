package com.busra.myapplication

fun fibonacci(n: Int): List<Int> {

    try {
        require(n >= 1)

        val fibonacciNumbers = mutableListOf(0, 1)

        while (fibonacciNumbers.size < n) {
            val nextFibonacci = fibonacciNumbers.takeLast(2).sum()
            fibonacciNumbers.add(nextFibonacci)
        }

        return fibonacciNumbers
    } catch (ex: Exception) {
        println("Pozitif bir tamsayı girmelisiniz. ")
        return emptyList()
    }
}

fun main() {
    print("Kaç Fibonacci sayısı görmek istersiniz? ")
    val n = readLine()?.toIntOrNull() ?: 0

    val fibonacciNumbers = fibonacci(n)
    println("Fibonacci Sayıları: $fibonacciNumbers")
}
