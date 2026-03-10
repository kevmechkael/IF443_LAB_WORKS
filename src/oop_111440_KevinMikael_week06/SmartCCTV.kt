package oop_111440_KevinMikael_week06

class SmartCCTV(override val id:String, override val name:String):SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV turning on")
        startRecording()
    }
    override fun turnOff() {
        println("CCTV turning off")
    }
    override fun startRecording() {
        println("CCTV starting to record")
    }
}