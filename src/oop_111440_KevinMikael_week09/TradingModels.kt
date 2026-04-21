package oop_111440_KevinMikael_week09

data class TradeLog(
    val pair: String,
    val position : String,
    val leverage: Int,
    val roe: Double,
    val status : String
)