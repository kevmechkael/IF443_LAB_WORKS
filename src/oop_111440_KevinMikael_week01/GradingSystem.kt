package oop_111440_KevinMikael_week01

fun main (args: Array<String>){
    var radius: Double = 7.0
    var pi: Double = 3.14
    var area: Double = pi * radius * radius
    println("Radius : " + radius + ", Area:" + area)
    checkSize(area)
}

fun checkSize(area: Double){
    if (area > 100){
        println("big circle")
    } else {
        println("small circle")
    }
}