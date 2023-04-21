fun sumFiltered(arr: List<Double?>) : Double {
    val res = arr.asSequence().filterNotNull().map{ if (it.toInt() % 2 != 0) it / 2 else it*it }.filter{ it < 25 }.
    sortedDescending().take(10).sum().roundTo(2)
    println(res)
    return res
}