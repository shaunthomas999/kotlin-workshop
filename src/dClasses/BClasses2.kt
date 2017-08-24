package dClasses

class Player21(var name: String) { // primary constructor
    // secondary constructor
    // should delegate to primary constructor using 'this'
    constructor(firstName: String, lastName: String) : this("$firstName $lastName")
}

class Player22 private constructor() // Don't make constructor accessible from outside

class Player23(var name: String) {
    init { // Initialization logic - usually put inside constructor in Java
        name = name.toUpperCase()
    }
}

// If all parameters are given a default value, then a parameter-less constructor will be generated by Kotlin
// Parameter-less constructor required by JPA, Jackson etc.
class Player24(var name: String = "")