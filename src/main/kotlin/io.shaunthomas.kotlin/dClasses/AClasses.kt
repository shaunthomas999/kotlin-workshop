package io.shaunthomas.kotlin.dClasses

class Empty // Empty class

class Player constructor(firstName: String) // constructor keyword is needed only with annotations and visibility modifiers

class Player2(firstName: String) // no constructor keyword. firstName val by default

class Player3(var firstName: String)

class Player4(var firstName: String, var lastName: String, val age: Int) // age is val - no setter

fun main(args: Array<String>) {

    // There is no 'new' operator in Kotlin
    val player4 = Player4("Robin", "van Persie", 34)
    println("player1.firstName > ${player4.firstName}")

    player4.firstName = "Arjen"
    player4.lastName = "Robben"
    //player4.age = 33 // Error - val cannot be reassigned
}