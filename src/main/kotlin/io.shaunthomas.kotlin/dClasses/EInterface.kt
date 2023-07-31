package io.shaunthomas.kotlin.dClasses

interface Skeleten {
    val id: Int
    fun getMeId(): Int
}

class Implementation : Skeleten {
    override val id: Int = 1
    override fun getMeId(): Int {
        return id
    }
}