package Decimal

fun main() {
    val n = readLine()!!.toInt()
    solution(n)
}

fun solution(n: Int) {
    val list = MutableList(n+1) { 0 }
    var count = 0;

    for(i in 2..n) {
        if(list[i] == 0) {
            count++
            for(j in i..n step i) {
                list[j] = 1
            }
        }
    }
    count.run(::println)
}
