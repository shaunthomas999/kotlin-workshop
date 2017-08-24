package eFunctions

/*
 * Can be applied to member functions and extension function
 * Should have only one parameter
 */
infix fun String.isSecondCharEqual(second: String) = get(1) == second.get(1) // keyword infix. this.get(1) is same as get(1)

fun main(args: Array<String>) {

    println("Shaun" isSecondCharEqual "shaun")

    println("Shaun".isSecondCharEqual("shaun"))
}