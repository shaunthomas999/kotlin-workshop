package io.shaunthomas.kotlin.cControlFlows

fun rangeExample() {

  val range = 0..10 step 3
  for (idx in range) {
    println(idx)
  }
}
