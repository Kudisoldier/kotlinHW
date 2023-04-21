fun numberToText(number: Int) : String {
    val hundredsText = mapOf(0 to "" , 1 to "сто", 2 to "двести", 3 to "триста", 4 to "четыреста", 5 to "пятьсот",
        6 to "шестьсот", 7 to "семьсот", 8 to "восемьсот", 9 to "девятьсот")
    val dozensText = mapOf(0 to "" , 1 to "десять", 2 to "двадцать", 3 to "тридцать", 4 to "сорок", 5 to "пятьдесят",
        6 to "шестьдесят", 7 to "семьдесят", 8 to "восемьдесят", 9 to "девяносто")
    val unitsText = mapOf(0 to "" , 1 to "один", 2 to "два", 3 to "три", 4 to "четыре", 5 to "пять",
        6 to "шесть", 7 to "семь", 8 to "восемь", 9 to "девять")

    val hundreds = number / 100
    val dozens = (number % 100) / 10
    val units = number % 10

    var result = ""
    result += hundredsText[hundreds]
    if (result.isNotEmpty()) {
        result += " "
    }
    result += dozensText[dozens]
    if (dozensText[dozens] != "") {
        result += " "
    }
    result += unitsText[units]
    println(result)

    return result
}
