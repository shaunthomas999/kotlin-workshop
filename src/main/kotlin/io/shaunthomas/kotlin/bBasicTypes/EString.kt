package io.shaunthomas.kotlin.bBasicTypes

fun main(args: Array<String>) {

  /*
   * String literal
   */

  // 1) Escaped string
  val s = "Hello, world!\n"

  // 2) Raw string
  // with white spaces
  val developerQuote = """
    A good programmer looks both
    ways before crossing a one way
    street
    """

  // remove leading white spaces
  val text = """
    >Tell me and I forget.
    >Teach me and I remember.
    >Involve me and I learn.
    >(Benjamin Franklin)
    """.trimMargin(">") // Default trim margin "|"

  /*
   * String templates
   */
  val hurray = "Hurray"
  println("Hurray $hurray")
  println("Length of hurray ${hurray.length}")
}
