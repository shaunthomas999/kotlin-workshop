package eFunctions

fun max1(a: Int, b: Int): Int { // No val or var
    return if (a < b) a else b
}

fun max2(a: Int, b: Int) = if (a < b) a else b

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c // // default

fun printMany(vararg elements: Int) { // vararg
    for (element in elements) {
        println(element)
    }

    doSomething(*elements) // spread operator
}

fun doSomething(vararg elements: Int) {
    for (element in elements) {
        println("Doing something $element")
    }
}

fun main(args: Array<String>) {
    sum(1, 2)
    sum(1, 2, 3)

    sum(b = 2, a = 1) // named arguments

    printMany(1, 2, 3, 4, 5)
}

