package oop_111440_KevinMikael_week07

fun main() {
    print("=== test singleton ===")
    println("status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== test companion object ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("=== Test Regular Class ===")
    val reg1 = RegularUser("Jack", 42)
    val reg2 = RegularUser("Jack", 42)
    println(reg1)
    println("Sama?" + (reg1 == reg2))
}