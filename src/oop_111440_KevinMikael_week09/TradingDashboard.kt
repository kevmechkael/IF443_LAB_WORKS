package oop_111440_KevinMikael_week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, -8.3, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, 5.7, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 8, -3.2, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 15, 9.1, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 12, -6.8, "CLOSED")
    )
    val closedTrade = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrade = closedTrade.filter { it.roe > 0 }
    val losingTrade = closedTrade.filter { it.roe <= 0 }
}