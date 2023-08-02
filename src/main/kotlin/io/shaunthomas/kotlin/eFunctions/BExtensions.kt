package io.shaunthomas.kotlin.eFunctions

/*
 * Mainly used to extend utils
 */

fun String.secondChar(): Char {
    return this.get(1)
}

fun String.secondChar2() = get(1) // this can be avoided

fun main(args: Array<String>) {
    println("Shaun".secondChar())

    println("Shaun".secondChar2())
}