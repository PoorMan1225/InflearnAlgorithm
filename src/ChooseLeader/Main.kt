package ChooseLeader

fun main() {
    val n = readLine()!!.toInt()
    val arr = Array(n) { Array(5) { readLine()!!.toInt() } }
    solution(n, arr)
}

fun solution(n: Int, arr: Array<Array<Int>>) {
    var max = Integer.MIN_VALUE
    var result = 0

    repeat(n) { i ->
        var count = 0
        repeat(n) { j ->
            run Break@{
                repeat(5) { k ->
                    if (arr[i][k] == arr[j][k]) {
                        count++
                        return@Break
                    }
                }
            }
        }
        if(count > max) {
            max = count
            result = i+1
        }
    }
}
