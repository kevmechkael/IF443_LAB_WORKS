package oop_111440_KevinMikael_week14

interface Database {
    fun query(sql: String) : List<String>
}
class PostgresDatabase: Database {
    override fun query(sql: String) = listOf("pg_data1", "pg_data2", "pg_data3", "pg_data4")
}
