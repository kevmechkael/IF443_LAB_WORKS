package oop_111440_KevinMikael_week04

fun main(){
//    println("Testing")
//    val generalVehicle = Vehicle("sepeda")
//    generalVehicle.honk()
//    generalVehicle.accelerate()
//    println("Testing Car")
//    val myCar = car("toyota", 4)
//    myCar.openTrunk()
//    myCar.honk()
//    myCar.accelerate()
//    val eCar = electricCar("polytron", 4, 100)
//    eCar.openTrunk()
//    eCar.accelerate()
//    eCar.honk()
    val manager = manager("andre", 500000)
    manager.work()
    println("bonus manager = " + manager.calculateBonus())
    val developer = Developer("kevin", 500000, "kotlin")
    developer.work()
    println("bonus developer = " + developer.calculateBonus())
}