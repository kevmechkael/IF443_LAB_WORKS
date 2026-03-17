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
    println(reg2)
    println("Sama?" + (reg1 == reg2))
    val data1 = DataUser("Jack", 42)
    val data2 = DataUser("Jack", 42)
    println(data1)
    println(data2)
    println("Sama?" + (data1 == data2))
    val data3 = data1.copy(age = 23)
    println("Hasil Copy : $data3")
    val (userName, userAge) = data1
    println("Destructuring $userName berumur $userAge")
    println("=== TEST SEALED CLASS ===")
    val response : ApiResponse = ApiResponse.Success("data berhasil ditarik")
    val uiMessage = when(response) {
        is ApiResponse.Success -> "tampilkan ${response.data}"
        is ApiResponse.error -> "munculkan alert ${response.message}"
    }
}