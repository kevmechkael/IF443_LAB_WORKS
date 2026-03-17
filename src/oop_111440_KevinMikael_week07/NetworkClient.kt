package oop_111440_KevinMikael_week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "http://api.umn.ac.id"
        fun createClient(): NetworkClient {
            return NetworkClient("$BASE_URL")
        }
    }
    fun connect() {
        println("Connected to $url")
    }
}