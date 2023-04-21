fun MutableList<Int>.square() : MutableList<Int> {
    for (i in this.indices) {
        this[i] *= this[i]
    }

    return this
}
