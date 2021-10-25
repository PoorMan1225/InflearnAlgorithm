package FindCharacter

fun main() {
    val str1 = readLine()
    val str2 = readLine()

    solution(str1!!, str2!!)
        .run(::println)
}

fun solution(str1: String, str2: String): Int =
    str1.lowercase()
        .filter { it == str2.lowercase()[0] }
        .length

