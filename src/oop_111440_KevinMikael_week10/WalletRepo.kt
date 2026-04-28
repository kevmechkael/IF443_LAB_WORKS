package oop_111440_KevinMikael_week10

interface Name {
    val name: String
}

class WalletRepo<T>() {
    private val Items = mutableListOf<T>()
    fun add(item: T){
        Items.add(item)
    }
    fun getAll(): List<T>{
        return Items
    }
    fun search(query: String): List<T>{
        return Items.filter {
            when (it) {
                is Name -> it.name.contains(query, ignoreCase = true)
                else -> false
            }
        }
    }
}