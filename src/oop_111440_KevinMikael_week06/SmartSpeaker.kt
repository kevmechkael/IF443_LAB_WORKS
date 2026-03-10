package oop_111440_KevinMikael_week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable  {
    var status :Boolean = false
    override fun turnOn() {
        println("speaker turning on")
        status = true
    }
    override fun turnOff() {
        println("speaker turning off")
        status = false
    }
    fun play(song :String){
        if (status){
            println("playing $song")
        }
    }
}