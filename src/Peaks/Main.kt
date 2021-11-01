package Peaks

fun main() {
    val n = readLine()!!.toInt()
    val arr = Array(n) { Array(n) { readLine()!!.toInt() } }
    solution(n, arr)
}

fun solution(n: Int, arr: Array<Array<Int>>) {
    val dx = arrayOf(-1, 0, 1, 0)
    val dy = arrayOf(0, 1, 0, -1)

    // 0,0 -> (0, -1) (left)

    var count = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            var flag = true
            for (k in 0 until 4) {
                val nx = j + dx[k]
                val ny = i + dy[k]
                if (nx in 0 until n && ny in 0 until n && arr[ny][nx] > arr[i][j]) {
                    flag = false
                    break
                }
            }
            if(flag) {
                count++
            }
        }
    }
    println(count)
}
