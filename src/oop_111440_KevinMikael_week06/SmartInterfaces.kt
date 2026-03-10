package oop_111440_KevinMikael_week06

interface SmartDevice {
    val id: String
    val name: String
}
interface Switchable {
    fun turnOn()
    fun turnOff()
}
interface Recordable {
    fun startRecording()
    fun stopRecording() {
        println("Recording stopped")
    }
}