package oop_111440_KevinMikael_week06

class SmartPhone: Camera, Phone {
    override fun turnOn(){
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Phone on")
    }
}