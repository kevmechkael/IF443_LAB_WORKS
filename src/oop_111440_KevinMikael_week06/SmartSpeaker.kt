package oop_111440_KevinMikael_week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable  {
    override fun turnOn(song :String) {
        println("speaker turning on, playing $song")
    }
    override fun turnOff() {
        println("speaker turning off")
    }
}