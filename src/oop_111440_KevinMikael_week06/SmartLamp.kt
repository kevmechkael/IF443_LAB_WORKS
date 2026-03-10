package oop_111440_KevinMikael_week06

class SmartLamp(override val id:String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println(" lamp turning on")
    }
    override fun turnOff() {
        println(" lamp turning off")
    }
}