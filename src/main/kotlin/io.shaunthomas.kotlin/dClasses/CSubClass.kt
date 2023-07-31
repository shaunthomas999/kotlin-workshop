package io.shaunthomas.kotlin.dClasses

open class SuperClass(var name: String) // classes are final by default. 'open' for inheritance. opposite of final.

class SubClass(name: String, name2: String) : SuperClass(name) // should call the constructor of super class