class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    val isEquilateral: Boolean
    val isIsosceles: Boolean
    val isScalene: Boolean
    val isDegenerate: Boolean

    init {
        val sides = listOf(a, b, c).map { it.toDouble() }

        val firstSum = a.toDouble() + b.toDouble()
        val secondSum = a.toDouble() + c.toDouble()
        val thirdSum = b.toDouble() + c.toDouble()

        require(firstSum >= c.toDouble() && secondSum >= b.toDouble() && thirdSum >= a.toDouble()) {
            "The sum of any two sides must be greater than or equal to the third side"
        }

        require(sides.count { it <= 0 } == 0) { "All sides must be greater than 0" }

        isEquilateral = sides.toSet().size == 1
        isIsosceles = sides.toSet().size <= 2
        isScalene = sides.toSet().size == 3
        isDegenerate =
                firstSum == c.toDouble() || secondSum == b.toDouble() || thirdSum == a.toDouble()
    }
}
