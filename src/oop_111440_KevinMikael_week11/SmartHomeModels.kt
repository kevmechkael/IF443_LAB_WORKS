package oop_111440_KevinMikael_week11

data class SmartDevice(var name: String, var category: String, var isOnline:Boolean = false, var powerLoad: Int= 0)

fun SmartDevice.diagnose(): String{
    return "[DIAGNOSTIK] $name | Kategori : $category | Status ${if (isOnline) "ON" else "OFF"} | Daya: $powerLoad watt"
}
