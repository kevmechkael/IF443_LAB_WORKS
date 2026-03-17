package oop_111440_KevinMikael_week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connected to $url")
    }
}