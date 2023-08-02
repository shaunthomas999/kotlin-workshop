package io.shaunthomas.kotlin.aHello

/*
 * Advanced "Hello Kotlin!"
 */
private val hello: String = "Hello" // Kotlin allows top-level properties and functions

fun main(args: Array<String>) {
  var world: String? = "World"
  world += "!"
  println(hello + " " + world)

  var helloObj: Hello =
    Hello()
  helloObj.helloMethod(7)
}
