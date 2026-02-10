package oop_111440_KevinMikael_week02

import java.util.Scanner


class loan(
    val bookTitle: String,
    val borrower: String,
    val durasi: Int = 1) {
    fun calculateFine():Int{
        if (durasi > 3) {
            val denda: Int
            denda = (durasi - 3) * 2000
            return denda
        } else {
            return 0
        }
    }
    init{
        println("buku = $bookTitle, peminjam = $borrower, denda = ${calculateFine()}")
    }
}
