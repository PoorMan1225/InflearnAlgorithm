package RockScissorsPaper

fun main() {
    val count = readLine()!!.toInt()
    val p1 = MutableList(count) { readLine()!!.toInt() }
    val p2 = MutableList(count) { readLine()!!.toInt() }

    solution(count, p1, p2)
}

fun solution(count: Int, p1: MutableList<Int>, p2: MutableList<Int>) {
    repeat(count) {
        when (p1[it] - p2[it]) {
            1, -2 -> "A"
            0 -> "D"
            else -> "B"
        }.run(::println)
    }
}
