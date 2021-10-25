package WordInSentence

fun main() {
    val str = readLine()
    solution(str!!).run(::println)
}

fun solution(str: String): String = str.split(" ").maxByOrNull { it.length } ?: "Null"

