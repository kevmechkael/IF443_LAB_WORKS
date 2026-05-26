package oop_111440_KevinMikael_week14

class MySQLDatabase{
    fun query(sql: String): List<String> = listOf("data1", "data2", "data3", "data4", "data5")
}

class UserService{
    private val database = MySQLDatabase()
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id = $id")
}