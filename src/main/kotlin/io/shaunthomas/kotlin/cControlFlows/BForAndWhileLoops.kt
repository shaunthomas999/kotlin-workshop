package io.shaunthomas.kotlin.cControlFlows

fun main() {

  /*
   * For loop
   *
   */

  val list = listOf(1, 2, 3)

  println("\n ~1~")
  for (element in list) { // list has to an iterator with next() and hasNext() methods
    println(element)
  }

  // Normal for loop is not allowed i.e. for(i = 0; i < list.size(); i++)
  println("\n ~2~")
  for (i in 1..9) { // including 9
    println(i)
  }

  println("\n ~3~")
  for (i in 1..50 step 2) { // in 2 step increments
    println(i)
  }

  println("\n ~4~")
  for (i in 1 until 10) { // excluding 10 (the same as 1..9)
    println(i)
  }

  println("\n ~5~")
  for (i in 9 downTo 1) { // decrement
    println(i)
  }

  // With Array
  val array = arrayOf(1, 2, 3)

  println("\n ~6~")
  // indices
  for (i in array.indices) { // array.indices is a range internally
    println(array[i])
  }

  println("\n ~7~")
  // withIndex()
  for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
  }


  /*
   * While & do-while loop
   *
   */
  println("\n ~8~")
  var x = 3
  while (x > 0) {
    println("in while loop > ${x--}")
  }

  println("\n ~9~")
  var y = 3
  do {
    println("in do-while loop > ${y--}")
  } while (y > 0)
}
