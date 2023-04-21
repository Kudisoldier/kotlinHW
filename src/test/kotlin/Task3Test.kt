import kotlin.test.Test
import kotlin.test.assertEquals

class Task3Test {
    @Test
    fun testSimple() {
        val input = sumFiltered(listOf(13.31, 3.98, 12.0, 2.99, 9.0))
        val expectedOutput = 22.09
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testNull() {
        val input = sumFiltered(listOf(null, 2.0, null))
        val expectedOutput = 4.0
        assertEquals(input, expectedOutput)
    }
}