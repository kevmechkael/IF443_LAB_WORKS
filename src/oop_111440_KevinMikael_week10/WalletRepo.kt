package oop_111440_KevinMikael_week10

class WalletRepo<T>() {
    private val Items = mutableListOf<T>()
    fun add(item: T){
        Items.add(item)
    }
    fun getAll(): List<T>{
        return Items
    }
}