package oop_111440_KevinMikael_week09

fun main(){
    val numbers = listOf(1,2,3,4,5)
    println(numbers)
    val evens = numbers.filter { it % 2 == 0 }
    println(evens)
}