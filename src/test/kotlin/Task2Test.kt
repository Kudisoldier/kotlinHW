import java.time.LocalDate
import java.util.logging.Handler
import kotlin.test.Test
import kotlin.test.assertEquals

class Task2Test {
    @Test
    fun testNullType() {
        val input = typeCasting(null)
        val expectedOutput = "Объект равен null"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testUnknownType() {
        val input = typeCasting(Handler::class)
        val expectedOutput = "Мне этот тип неизвестен"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testStringType() {
        val input = typeCasting("a")
        val expectedOutput = "Я получил тип String = ‘a’, ее длина равна 1"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testStringTypeEmpty() {
        val input = typeCasting("")
        val expectedOutput = "Я получил тип String = ‘’, ее длина равна 0"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testIntType() {
        val input = typeCasting(2)
        val expectedOutput = "Я получил Int = 2, его квадрат равен 4"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testIntTypeZero() {
        val input = typeCasting(0)
        val expectedOutput = "Я получил Int = 0, его квадрат равен 0"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testIntTypeNegative() {
        val input = typeCasting(-2)
        val expectedOutput = "Я получил Int = -2, его квадрат равен 4"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testDoubleType() {
        val input = typeCasting(0.005)
        val expectedOutput = "Я получил Double = 0.005, это число округляется до 0.01"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testDoubleTypeLess() {
        val input = typeCasting(0.004)
        val expectedOutput = "Я получил Double = 0.004, это число округляется до 0.0"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testDateTypeAfter() {
        val input = typeCasting(LocalDate.of(2020,1,1))
        val expectedOutput = "Я получил LocalData = 2020-01-01, она больше чем дата основания Tinkoff"
        assertEquals(input, expectedOutput)
    }

    @Test
    fun testDateTypeBefore() {
        val input = typeCasting(LocalDate.of(2005,1,1))
        val expectedOutput = "Я получил LocalData = 2005-01-01, она меньше чем дата основания Tinkoff"
        assertEquals(input, expectedOutput)
    }
}