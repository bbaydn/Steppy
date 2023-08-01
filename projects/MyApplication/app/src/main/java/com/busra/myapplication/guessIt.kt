package com.busra.myapplication

import kotlin.random.Random

fun main() {
    val maxTahminHakki = 5
    val rastgeleSayi = Random.nextInt(1, 101) // 1 ile 100 arasında rastgele bir sayı seçelim
    var tahminHakki = maxTahminHakki

    println("1 ile 100 arasında bir sayı tahmin edin.")
    println("Toplam $maxTahminHakki tahmin hakkınız var.")

    while (tahminHakki > 0) {
        print("Tahmininiz: ")
        val tahmin = readLine()?.toIntOrNull()

        if (tahmin == null) {
            println("Geçerli bir sayı girmelisiniz.")
            continue
        }

        if (tahmin == rastgeleSayi) {
            println("Tebrikler! Doğru tahmin ettiniz.")
            break
        } else if (tahmin < rastgeleSayi) {
            println("Daha büyük bir sayı girin. Kalan tahmin hakkı: ${tahminHakki - 1}")
        } else {
            println("Daha küçük bir sayı girin. Kalan tahmin hakkı: ${tahminHakki - 1}")
        }

        tahminHakki--
    }

    if (tahminHakki == 0) {
        println("Tahmin hakkınız kalmadı. Doğru sayı: $rastgeleSayi")
    }
}
