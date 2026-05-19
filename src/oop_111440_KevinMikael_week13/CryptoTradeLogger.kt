package oop_111440_KevinMikael_week13

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin : Double, val pnl: Double)
fun TradeRecord.toCsv(): String = "$id, $symbol, $type, $margin, $pnl"
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
        null
    }
}