package aHello

/*
 * Advanced "Hello Kotlin!"
 */
fun main(args: Array<String>) {
    val hello: String = "Hello"
    var kotlin: String? = "Kotlin"
    kotlin += "!"
    println(hello + " " + kotlin)

    var helloObj: Hello = Hello()
    helloObj.helloMethod(7)
}