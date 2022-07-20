package bBasicTypes

fun main(args: Array<String>) {

    /*
     * Data types
     *
     */

    val double: Double = 10.0 // 64 bit
    val float: Float = 10.0F // or f, 32 bit

    val long: Long = 10L // 64 bit
    val int: Int = 10 // 32 bit

    // Short - 16 bit
    // Byte - 8 bit

    val hexadecimal = 0x0F // Prefix '0x'
    val binary = 0b01 // Prefix '0b'

    /*
     * Underscore in numeric literals (since Kotlin 1.1)
     *
     */

    val oneMillion = 1_000_000
    println("oneMillion " + oneMillion)

    val creditCardNumber = 1234_5678_9012_3456L
    println("creditCardNumber" + creditCardNumber)

    val socialSecurityNumber = 999_99_9999L
    println("socialSecurityNumber" + socialSecurityNumber)



    /*
     * Boxed
     *
     */
    val a: Int = 10000 // JVM > primitive type
    val b: Int? = 20000 // Boxed - JVM > java.lang.Integer



    /*
     * '==' and '==='
     *
     */
    val c: Int = 10000
    val boxedC: Int? = c
    val anotherBoxedC: Int? = c
    println(boxedC == anotherBoxedC) // Prints 'true' - Checks value
    println(boxedC === anotherBoxedC) // Prints 'false' - Checks type and value



}