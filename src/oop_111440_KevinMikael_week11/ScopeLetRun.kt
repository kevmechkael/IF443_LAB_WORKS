package oop_111440_KevinMikael_week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alex"
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("panjang nama : $length")
}