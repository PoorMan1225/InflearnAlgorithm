package ReverseDecimal

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) { readLine()!!.toInt() }
    solution(list)
}

// 123 -> 3
// 12 -> 2
// 1 -> 1

// 3 * 100
// 2 * 10
// 1 * 1

// res * 10 + 3(123 % 10) -> 3  -> res = 0
// res * 10 + 2(12 % 10) -> 32  -> res = 3
// res * 10 + 1(1 % 10)  -> 321 -> res = 32

fun solution(list: MutableList<Int>) {
    list.run(::println)
    val result = list.map { number ->
        var tmp = number
        var res = 0
        while(tmp > 0) {
            val t = tmp % 10
            res = res * 10 + t  // 3
            tmp /= 10
        }
        res
    }.filter { it.isPrime() }
    result.run(::println)
}

fun Int.isPrime(): Boolean {
    if(this == 1) return false

    (2..this).forEach { div ->
        if(div * div > this) {
            return@forEach
        }else {
            if(this % div == 0)
                return false
        }
    }
    return true
}
