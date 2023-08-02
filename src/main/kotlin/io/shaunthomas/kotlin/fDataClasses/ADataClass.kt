package io.shaunthomas.kotlin.fDataClasses

data class Student(var firstName: String,
                   var lastName: String,
                   var age: Int,
                   var address: String,
                   var level: Int)

fun main(args: Array<String>) {
    val student = Student("John", "Lewis", 12, "Haarlem", 7)

    val studentCopy = student.copy(level = 8)

    val (firstName, _, _, _, level) = student

    println("$firstName $level")
}