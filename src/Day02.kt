fun main() {
    fun part1(lst: List<Pair<String, Int>>): Int {
        var horizontal = 0
        var vertical = 0

        val directions = HashMap<String, Int>()
        directions["up"] = -1
        directions["down"] = 1

        lst.forEach {
            val direction = it.first
            val distance = it.second

            if (direction == "up" || direction == "down") {
                vertical += directions[direction]!!.times(distance)
            } else {
                horizontal += distance
            }
        }

        return horizontal * vertical
    }

    fun part2(lst: List<Pair<String, Int>>): Int {
        var aim = 0
        var depth = 0
        var horizontal = 0

        val directions = HashMap<String, Int>()
        directions["up"] = -1
        directions["down"] = 1

        lst.forEach {
            val direction = it.first
            val distance = it.second

            if (direction == "up" || direction == "down") {
                aim += directions[direction]!!.times(distance)
            } else {
                horizontal += distance
                depth += aim * distance
            }
        }

        return horizontal * depth
    }

    // test if implementation meets criteria from the description, like:
    val lst = readInput("day1_input_test").map {
        val pair = it.split(" ")
        Pair(pair[0], pair[1].toInt())
    }

    print(part2(lst))
}
