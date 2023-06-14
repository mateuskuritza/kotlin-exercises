class MatrixString(private val matrixAsString: String) {

    private val matrix: List<List<Int>> =
            matrixAsString.split("\n").map { it.split(" ") }.map { it.map { it.toInt() } }

    fun column(colNr: Int): List<Int> {
        return matrix.map { it.get(colNr - 1) }
    }

    fun row(rowNr: Int): List<Int> {
        return matrix.get(rowNr - 1)
    }
}

/*
    Split the string using breaklines as separator
    Split each line using spaces as separator
    Convert each element to Int
    Return the row
*/
