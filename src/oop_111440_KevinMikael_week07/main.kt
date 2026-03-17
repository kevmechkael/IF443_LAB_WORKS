package oop_111440_KevinMikael_week07

fun main() {
    print("=== test singleton ===")
    println("status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== test companion object ===")
    val client = NetworkClient.createClient()
    client.connect()
}