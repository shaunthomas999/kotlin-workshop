package io.shaunthomas.kotlin.eFunctions

// Traditional way
fun max1(a: Int, b: Int): Int { // No val or var
    return if (a < b) b else a
}

// Single way
fun max2(a: Int, b: Int) = if (a < b) b else a

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c // // default

fun printOne(element: Int) { // Default return type Unit
    println(element)
}

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

fun doSomeOtherThing(param: String?) { // ? nullable

    // Safe calls (?) Dealing with nullable objects.
    // !! - Exempt Intellij IDEA from showing error
    println("Length of param > ${param?.length}")
}


fun main(args: Array<String>) {
    sum(1, 2)
    sum(1, 2, 3)

    sum(b = 2, a = 1) // named arguments

    printOne(1)

    printMany(1, 2, 3, 4, 5)

    doSomeOtherThing(null)
    doSomeOtherThing("Sytac")

}

