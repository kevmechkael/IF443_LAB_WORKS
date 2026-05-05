package oop_111440_KevinMikael_week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philip","lightning").apply{
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    SmartDevice("ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also{
        println("kamera ${it.name} terhubung")
        homeDevices.add(it)
    }

}