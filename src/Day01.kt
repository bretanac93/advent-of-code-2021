fun main() {
    fun part1(lst: List<Int>): Int {
        val len = lst.size
        val arr = Array(lst.size) { 0 }

        for (pos in 1 until len) {
            arr[pos] = lst[pos].compareTo(lst[pos - 1])
        }

        return arr.fold(0) { acc, num -> acc + num }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val lst = readInput("day1_input_test").map { it.toInt() }

    print(part1(lst))
}
