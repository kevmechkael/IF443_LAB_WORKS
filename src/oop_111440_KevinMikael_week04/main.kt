package oop_111440_KevinMikael_week04

fun main(){
    println("Testing")
    val generalVehicle = Vehicle("sepeda")
    generalVehicle.honk()
    generalVehicle.accelerate()
    println("Testing Car")
    val myCar = car("toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

}