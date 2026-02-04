package oop_111440_KevinMikael_week01

fun main(){
    val gameTitle: String = "god of war"
    val price: Int = 100000
    var discountedPrice = discount(price)

    printReceipt(gameTitle, discountedPrice)
}

fun discount(price: Int) = if (price > 500000) (price * 80 / 100).toInt() else (price * 90/100).toInt()

fun printReceipt(gameTitle: String, finalPrice : Int){
    println("$gameTitle - $finalPrice ")
}