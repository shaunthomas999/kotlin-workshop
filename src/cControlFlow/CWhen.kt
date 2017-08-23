package cControlFlow

import java.lang.Integer.parseInt

fun main(args: Array<String>) {

    /*
     * When (switch-case / if-else if chain) statements
     *
     */

    // with constants
    val x = 0
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    // with expression
    val s = "0"
    when (x) {
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }

    // with ranges
    val validNumbers = 25..35
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }




    /*
     * When expression
     *
     */
    val y = "prefix word suffix"
    val hasPrefix = when(y) { // Smart casts
        is String -> y.startsWith("prefix") // Smart casts
        else -> false
    }




    /*
     * if-else if chain
     */
    val z = 21
    when { // No variable specified
        z > 40 -> print("z > 40")
        z != 50 -> print("z != 50")
        else -> print("z")
    }
}