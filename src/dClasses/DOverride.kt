package dClasses

open class Base {
    open var name: String = "Base" // 'open' for overriding. final by default.
    open fun printName() {
        println(name)
    }
}

class Derived : Base() {
    override var name: String = "Derived"
    override fun printName() {
        println(name)
    }
}
