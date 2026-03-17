package oop_111440_KevinMikael_week07

object DatabaseManager {
    var connectionStatus:String = "disconnected"
    fun connect() {
        connectionStatus = "Connected"
        println("Connected to database")
    }
}
