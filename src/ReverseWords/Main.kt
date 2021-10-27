package ReverseWords

fun main() {
    val c = readLine()?.toInt()
    val list = MutableList(c!!) { readLine().toString()}
//    solution(list)
    solution2(list)
}

fun solution(list: MutableList<String>) =
    list.map { it.reversed() }
        .forEach { println(it) }

fun solution2(list: MutableList<String>) {
    list.map { it.translate() }.forEach { println(it) }
}

fun String.translate(): String {
    val lt = 0
    val rt = this.length-1
    val c = this.toCharArray()
    val tmp: Char = c[lt]
    c[lt] = c[rt]
    c[rt] = tmp
    return c.concatToString()
}