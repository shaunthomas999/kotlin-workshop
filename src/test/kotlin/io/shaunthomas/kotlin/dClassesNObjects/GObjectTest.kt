package io.shaunthomas.kotlin.dClassesNObjects

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GObjectTest {

  @Test
  fun `test companion`() {
    assertEquals("Shaun", GObject.NAME)
  }
}
