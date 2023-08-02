package io.shaunthomas.kotlin.hCollections

object aList {

  fun repeatedList01(): List<String> {
    return List(3) { index -> "Hello #$index" }
  }
}
