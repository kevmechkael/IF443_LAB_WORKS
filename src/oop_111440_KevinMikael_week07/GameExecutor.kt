package oop_111440_KevinMikael_week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("encounter monster ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            val(item) = event
            println("LootDropped ${item.name}, ${item.rarity}")
        }
        is BattleState.GameOver -> {
            print("Game over because ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("SAFEZONE")
        }
    }
}