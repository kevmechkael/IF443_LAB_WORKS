package oop_111440_KevinMikael_week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int) : Shape {
    override fun area() = width * height
}

class SafeSqare(var side: Int): Shape {
    override fun area() = side * side
}