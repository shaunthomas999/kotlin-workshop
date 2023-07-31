package io.shaunthomas.kotlin.eFunctions

fun someFunction(b: String?) {

    // Normal
    val l1: Int = if (b != null) b.length else -1

    // Elvis operator
    val l2 = b?.length ?: -1
}

fun main(args: Array<String>) {

    someFunction(null)
    someFunction("Sytac")
}