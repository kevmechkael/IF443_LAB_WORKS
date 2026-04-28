package oop_111440_KevinMikael_week10

fun main(){
    println("=== test generic class ===")
    val intBox = Box(100)
    val  stringBox = Box("Hello World")
    println(intBox.value)
    println(stringBox.value)
}