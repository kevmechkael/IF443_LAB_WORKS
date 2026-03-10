package oop_111440_KevinMikael_week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }
    fun turnOFFALLswitch(){
        for(device in devices){
            if (device is Switchable){
                device.turnOff()
            }
        }
    }
}