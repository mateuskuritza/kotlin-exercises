class Squares(numbersQuantity: Int) {
    private val numbers: List<Int> = List(numbersQuantity) { it + 1 }

    fun sumOfSquares(): Int {
        return this.numbers.map { it * it }.sum()
    }

    fun squareOfSum(): Int {
        return this.numbers.sum().let { it * it }
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
