package io.shaunthomas.kotlin.cControlFlows

fun main(args: Array<String>) {

    val a: Int = 10
    val b: Int = 20

    /*
     * if - else statement (else is optional)
     */
    var max1: Int
    if (a > b) {
        max1 = a
    } else {
        max1 = b
    }



    /*
     * if - else expression (else is mandatory)
     */
    // value of b will be stored in max
    val max2 = if (a > b) a else b

    // prints "Choose a" and value of a will be stored in min
    val min = if (a < b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

}