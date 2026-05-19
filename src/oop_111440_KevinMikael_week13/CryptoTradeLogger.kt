package oop_111440_KevinMikael_week13

import java.io.File

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin : Double, val pnl: Double)
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"
fun fromCsvtrade(line: String): TradeRecord? {
    val token = line.split(",")
    return try{
        TradeRecord(
            token[0].toInt(),
            token[1],
            token[2],
            token[4].toDouble(),
            token[5].toDouble()
        )
    }catch (e: Exception){
        println("Error parsing line: $line")
        null
    }
}
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer -> trades.forEach { writer.println(it.toCsv()) } }
}
fun loadTrades(path: String) : List<TradeRecord> {
    return File(path).readLines().mapNotNull { fromCsvtrade(it) }
}

fun main(){
    val trades = listOf<TradeRecord>(
        TradeRecord(20, "BTCUSDT", "Long", 32.0,30.0),
        TradeRecord(20, "BTCUSDT", "Long", 32.0,30.0)
    )
    saveTrades(trades,"src/oop_111440_KevinMikael_week13/crypto_trades.csv")
    File("src/oop_111440_KevinMikael_week13/crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    val loadeddata =loadTrades("src/oop_111440_KevinMikael_week13/crypto_trades.csv")
    loadeddata.sumOf{it.pnl}
}