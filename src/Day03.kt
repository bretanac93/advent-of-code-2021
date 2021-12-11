fun main() {
    fun part1(matrix: List<List<Char>>): Int {
        val lenNum = matrix.first().size
        val gammaRate = List(lenNum) { '0' }

        for (i in 0 until lenNum) {
            var countZeroes = 0
            var countOnes = 0
            for (j in matrix.indices) {
                when(matrix[j][i]) {
                    '0' -> countZeroes++
                    else -> countOnes++
                }
            }

            println("*****************************")
        }

        return 0
    }

    fun part2(matrix: List<Pair<String, Int>>): Int {
        return 0
    }

    // test if implementation meets criteria from the description, like:
    val matrix = readInput("input").map { it.toList() }
    part1(matrix)
}
