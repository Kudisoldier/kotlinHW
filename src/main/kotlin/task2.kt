import java.time.LocalDate
import kotlin.math.pow
import kotlin.math.roundToInt

fun Double.roundTo(numFractionDigits: Int): Double {
    val factor = 10.0.pow(numFractionDigits.toDouble())
    return (this * factor).roundToInt() / factor
}

fun typeCasting(type : Any?) : String {
    var result = "Мне этот тип неизвестен"

    if (type == null) {
        result = "Объект равен null"
    } else if (type is String) {
        result = "Я получил тип String = ‘$type’, ее длина равна ${type.length}"
    } else if (type is Int) {
        result = "Я получил Int = $type, его квадрат равен ${type*type}"
    } else if (type is Double) {
        result = "Я получил Double = $type, это число округляется до ${type.roundTo(2)}"
    } else if (type is LocalDate) {
        result = "Я получил LocalData = $type, "
        if (type.isAfter(LocalDate.of(2006,12,24))) {
            result += "она больше чем дата основания Tinkoff"
        } else {
            result += "она меньше чем дата основания Tinkoff"
        }
    }

    println(result)
    return result
}
