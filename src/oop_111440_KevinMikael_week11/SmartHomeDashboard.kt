package oop_111440_KevinMikael_week11

import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyles

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
    val acInverter = run{
        val device = SmartDevice("Daikin inverter(Kabel 3X2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acInverter)
    homeDevices.add(SmartDevice("picolo's Auto Feeder", "pet care", true, 10))
    val searchResult = homeDevices.find{it.category == "Camera"}
    searchResult?.let {
        val hasil = it.diagnose()
        println(hasil)
    }
    val summary = with(homeDevices){
        this.forEach { println(it.diagnose()) }
        println(this.size)
    }
    val totalPower = homeDevices.run {
        sumOf{it.powerLoad}
    }
    println(totalPower)


}