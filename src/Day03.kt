fun main() {
    fun part1(matrix: List<List<Char>>): Int {
        val lenNum = matrix.first().size
        val gammaRate = Array(lenNum) { 0 }
        val epsilonRate = Array(lenNum) { 0 }

        for (i in 0 until lenNum) {
            var countZeroes = 0
            var countOnes = 0
            for (j in matrix.indices) {
                when (matrix[j][i]) {
                    '0' -> countZeroes++
                    else -> countOnes++
                }
            }
            if (countOnes > countZeroes) {
                gammaRate[i] = 1
            } else {
                epsilonRate[i] = 1
            }
        }

        val gammaBinary = gammaRate.toList().joinToString("")
        val epsilonBinary = epsilonRate.toList().joinToString("")

        val gammaVal = Integer.parseInt(gammaBinary, 2)
        val epsilonVal = Integer.parseInt(epsilonBinary, 2)

        return gammaVal * epsilonVal
    }

    fun part2(matrix: List<Pair<String, Int>>): Int {
        return 0
    }

    // test if implementation meets criteria from the description, like:
    val matrix = readInput("input").map { it.toList() }
    print(part1(matrix))
}
