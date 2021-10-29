package DistanceWords

import kotlin.math.abs

fun main() {
    val str = readLine()
    val e = readLine()
    solution(str!!, e!!)
}

fun solution(str: String, e: String) {
    val idxList = str
        .mapIndexed { index, c -> if (c == e.first()) index else -1 }
        .filter { it > -1 }

    val result = str.mapIndexed { index, _ ->
        var min = 100
        idxList.forEach { idx ->
            if (min > abs(idx - index)) {
                min = abs(idx - index)
            }
        }
        min
    }
    result.toString().run(::println)
}
