package oop_111440_KevinMikael_week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("Speed: $speed")
    }
    open fun honk(){
        println("beep")
    }
}