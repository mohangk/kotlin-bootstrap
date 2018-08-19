import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.Test

import bootstrap.BusinessLogic

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BusinessLogicTest {
    val bl = BusinessLogic()

    @Test
    fun `when its tested it has a first test`() {
        assertEquals("it has an output", bl.output())
    }
}