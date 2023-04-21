import kotlin.test.Test
import kotlin.test.assertEquals

class Task4Test {
    @Test
    fun testUnits() {
        val input = numberToText(2)
        val expectedOutput = "два"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testDozens() {
        val input = numberToText(32)
        val expectedOutput = "тридцать два"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testHundreds() {
        val input = numberToText(132)
        val expectedOutput = "сто тридцать два"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testZeroOmit() {
        val input = numberToText(102)
        val expectedOutput = "сто два"
        assertEquals(input, expectedOutput)
    }
}
