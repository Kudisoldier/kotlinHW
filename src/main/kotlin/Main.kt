import java.time.LocalDate
import java.util.logging.Handler

fun main(args: Array<String>) {
    println("Task 1")
    val input : MutableList<Int> = mutableListOf(1, 4, 9, 16, 25)
    println("Input: " + input.joinToString(" "))
    println("Output: " + input.square().joinToString(" "))

    println("Task 2")
    typeCasting(null)
    typeCasting("Privet")
    typeCasting(145)
    typeCasting(145.004)
    typeCasting(145.2817812)
    typeCasting(LocalDate.of(1990,1,1))
    typeCasting(Handler::class)

    println("Task 3")
    sumFiltered(listOf(13.31, 3.98, 12.0, 2.99, 9.0))

    println("Task 4")
    numberToText(975)
}