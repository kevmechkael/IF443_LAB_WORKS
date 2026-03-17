package oop_111440_KevinMikael_week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }
        fun forgeEpicSword(): Weapon{
           return Weapon(GameItem("Pedang rahasia asli kebumen", 5000, ItemRarity.EPIC), 1000)
        }
    }
}