package oop_111440_KevinMikael_week06

class Button(override var name: String) : Clickable {
    override fun click() {
        println("$name Button clicked")
    }
}