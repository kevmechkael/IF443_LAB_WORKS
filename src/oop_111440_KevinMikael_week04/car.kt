package oop_111440_KevinMikael_week04

open class car(brand : String, val numberOfDoors: Int): Vehicle(brand) {
    fun openTrunk(){
        println("Trunk $brand with $numberOfDoors doors is opened")
    }
    override fun honk(){
        println("TIN TIN")
    }

    override fun accelerate() {
        super.accelerate()
        println("mobil $brand menambah kecepatan")
    }
}