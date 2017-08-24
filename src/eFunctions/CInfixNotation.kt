package eFunctions

/*
 * Can be applied to member functions and extension function
 * Should have only one parameter
 */
infix fun String.isSecondCharEqual(second: String) = get(1) == second.get(1) // keyword infix. this.get(1) is same as get(1)

infix fun Int.addLeftToRight(second: Int) = this + second

fun main(args: Array<String>) {

    println("Shaun" isSecondCharEqual "shaun")
    println("Shaun".isSecondCharEqual("shaun"))

    println(1 addLeftToRight 2) // 3
}