package oop_111440_KevinMikael_week10

fun main(){
    println("=== test generic class ===")
    val intBox = Box(100)
    val  stringBox = Box("Hello World")
    println(intBox.value)
    println(stringBox.value)
    println("=== TEST MULTIPLE PARAMETERS===")
    val itemPrice = PairBox("BitCoin",2000)
    println(itemPrice.value)
    println(itemPrice.key)
}