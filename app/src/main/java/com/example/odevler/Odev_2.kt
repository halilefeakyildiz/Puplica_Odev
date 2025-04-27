package com.example.odevler
//1
fun main() {
    fun fahrenheit(degree: Int): Double {
        return degree * 1.8 + 32
    }

    val result = fahrenheit(25)
    println(result)

//2

    fun dikdortgenCevresi(uzunKenar: Int, kisaKenar: Int): Int {
        return 2 * (uzunKenar + kisaKenar)
    }

    val cevre = dikdortgenCevresi(10, 5)
    println("Dikdörtgenin çevresi: $cevre")


    //3

        fun faktoriyel(sayi: Int): Int {
            var sonuc = 1
            for (i in 1..sayi) {
                sonuc *= i
            }
            return sonuc
        }

        val sonuc = faktoriyel(5)
        println("5 sayısının faktöriyeli: $sonuc")

//4
        fun icAciToplami(kenarSayisi: Int): Int {
            return (kenarSayisi - 2) * 180
        }

        val toplam = icAciToplami(5)
        println("5 kenarlı bir çokgenin iç açılar toplamı: $toplam derece")

    //5
        fun kotaUcreti(kullanimGB: Int): Int {
            val sabitUcret = 100
            return if (kullanimGB <= 50) {
                sabitUcret
            } else {
                val ekstraGB = kullanimGB - 50
                sabitUcret + (ekstraGB * 4)
            }
        }

        val ucret = kotaUcreti(60)
        println("60 GB kullanım için ücret: $ucret ₺")


}