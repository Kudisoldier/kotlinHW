import kotlin.test.Test
import kotlin.test.assertEquals

class Task1Test {
    @Test
    fun testSquareSimple() {
        val input = mutableListOf(1, 4, 9, 16, 25)
        val expectedOutput = mutableListOf(1, 16, 81, 256, 625)
        assertEquals(input.square(), expectedOutput)
    }

    @Test
    fun testSquareNegative() {
        val input = mutableListOf(-5, -2, 0, 100)
        val expectedOutput = mutableListOf(25, 4, 0, 10000)
        assertEquals(input.square(), expectedOutput)
    }
}