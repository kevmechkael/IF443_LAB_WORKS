package oop_111440_KevinMikael_week04

open class electricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("mobil $brand menambah kecepatan dalam sunyi, kapasitas baterai $batteryCapacity")
    }
}