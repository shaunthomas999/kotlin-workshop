package io.shaunthomas.kotlin.dClassesNObjects

abstract class Ship {
    abstract fun getColor(): String
}

class WarShip : Ship() {
    override fun getColor(): String {
        return "grey"
    }
}
