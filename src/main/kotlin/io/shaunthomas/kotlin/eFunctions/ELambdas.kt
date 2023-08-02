package io.shaunthomas.kotlin.eFunctions

fun main(args: Array<String>) {

    /*
     * Lambda definitions
     *
     */

    val sum1 = { x: Int, y: Int -> x + y }
    println(sum1(1, 2))

    val sum2: (Int, Int) -> Int = { x, y -> x + y }
    println(sum2(1, 2)) // 3

    /*
     * Higher Order functions
     *
     */

    val string = "one, two, three"

    println(string.filter({ c: Char -> c in 'a'..'z' }))   // "onetwothree"

    string.filter() { c: Char -> c in 'a'..'z' }

    string.filter { c: Char -> c in 'a'..'z' }

    string.filter { c -> c in 'a'..'z' }

    string.filter { it in 'a'..'z' }

}