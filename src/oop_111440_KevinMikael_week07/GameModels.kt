package oop_111440_KevinMikael_week07

enum class ItemRarity(val dropChance:Int) {
    COMMON(44),
    UNCOMMON(30),
    RARE(15),
    EPIC(10),
    LEGENDARY(1);
}

data class GameItem(
    val name:String,
    val damage:Int,
    val rarity: ItemRarity
)