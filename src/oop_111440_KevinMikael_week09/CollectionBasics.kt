package oop_111440_KevinMikael_week09

fun main(){
    println("=== test list ===")
    val frameworks: List<String> = listOf("kotlin", "java", "c++")
    println(frameworks)
    val scores : MutableList<Int> = mutableListOf(1,2,3,4,5)
    scores.add(95)
    scores[0] = 88
    println("mutable list : $scores")
    println("=== test set ===")
    val uniqueNum = setOf(1,2,2,2,2,3,4,5)
    println(uniqueNum)
    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println(activeUsers)
}