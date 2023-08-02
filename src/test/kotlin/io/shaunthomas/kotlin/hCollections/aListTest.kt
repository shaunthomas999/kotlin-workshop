package io.shaunthomas.kotlin.hCollections

import io.kotest.matchers.collections.shouldHaveSize
import org.junit.jupiter.api.Test

class aListTest {

    @Test
    fun repeatedList01() {
      val repeated = aList.repeatedList01()

      repeated.shouldHaveSize(3)

      repeated.forEach { println(it) }
    }
}
