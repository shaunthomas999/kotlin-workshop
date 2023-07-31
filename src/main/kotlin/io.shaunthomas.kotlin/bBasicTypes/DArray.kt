package io.shaunthomas.kotlin.bBasicTypes

fun main(args: Array<String>) {

  /*
   * Array<T>
   */
  val cities: Array<String> = arrayOf("Amsterdam", "Utrecht", "Rotterdam")

  // get
  val firstCity = cities.get(1)

  // set
  cities.set(3, "The Hague")

  // size
  val count = cities.size

  // iteration
  for (city in cities) {
    println(city)
  }


  /*
   * Special array for primitives (Number, Character and Boolean)
   *
   */
  val numbers: IntArray = intArrayOf(1, 2, 3)
}
