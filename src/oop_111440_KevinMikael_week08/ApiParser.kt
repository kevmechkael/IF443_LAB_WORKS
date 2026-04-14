package oop_111440_KevinMikael_week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {"API INVALID MISSING ID"}
        val name = requireNotNull(rawJson["name"] as? String) {"API INVALID MISSING NAME"}
        val type = rawJson["type"] as? String
        return if (type == "ELECTRONIC"){
            val warranty = rawJson["warranty"] as? Int ?: 12
            Electronic(id, name, warranty)
        }else if(type == "CLOTHING"){
            val size = rawJson["size"] as? String ?: "All suze"
            Clothing(id, name, size)
        } else null
    }
}