fun main() {
    fun part1(lst: List<Int>): Int {
        val len = lst.size
        val arr = Array(lst.size) { 0 }

        for (pos in 1 until len) {
            arr[pos] = (lst[pos] > lst[pos - 1]).toInt()
        }

        return arr.fold(0) { acc, num -> acc + num }
    }

    fun part2(input: List<Int>): Int {
        var depth1 = 0
        var depth2 = 0
        var count = 0
        for (i in 0 until input.size - 3) {
            depth1 = input[i] + input[i + 1] + input[i + 2]
            depth2 = input[i + 1] + input[i + 2] + input[i + 3]
            if (depth2 > depth1) count++
        }

        return count
    }

    // test if implementation meets criteria from the description, like:
    val lst = readInput("day1_input_test").map { it.toInt() }

    print(part2(lst))
}
