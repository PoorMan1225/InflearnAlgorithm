package Fibonacci

fun main() {
    val count = readLine()
    solution(count!!)
}

fun solution(count: String) {
    var a = 1
    var b = 1
    print("$a $b ")

    repeat(count.toInt()) {
        val c = a+b
        print("$c ")
        a = b
        b = c
    }
}
