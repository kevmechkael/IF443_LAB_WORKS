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
    println("=== test generic functions===")
    printData(3.14)
    val result = processData("Stable Coin")
    println(result)
    println("=== TEST constraint===")
    val math = MathBox(10.5,20)
    println("total : ${math.sum()}")
    println("terbesar: ${getMax(45,299)}")
}