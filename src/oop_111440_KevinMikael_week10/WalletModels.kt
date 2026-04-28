package oop_111440_KevinMikael_week10

data class Coin(override val name: String, val Balance: Double) : Name
data class Transaction(val id: String, val amount: Double)
