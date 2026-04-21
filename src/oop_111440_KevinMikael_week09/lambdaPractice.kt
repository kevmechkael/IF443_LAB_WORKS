package oop_111440_KevinMikael_week09

fun main(){
    println("=== test lambda ===")
    val sumLambda = {a : Int, b : Int -> b + a}
    println(sumLambda(1,2))

    val squareImplicit : (Int) -> Int = { it * it }
    println(squareImplicit(10))
}