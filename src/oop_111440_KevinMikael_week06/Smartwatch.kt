package oop_111440_KevinMikael_week06

class Smartwatch : watch(), Bluetooth, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HO di sekitar untuk pairing")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik")
    }
}