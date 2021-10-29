package RemoveDuplictaeCharacter

fun main() {
    val str = readLine()
//    solution(str!!)
    solution2(str!!).run(::println)
}

fun solution(str: String): String {
    val carr = str.toCharArray()
    val sb = StringBuilder()

    carr.forEachIndexed { i, c ->
        if (i == str.indexOf(c)) {
            sb.append(c)
        }
    }
    return sb.toString()
}

fun solution2(str: String) =
    str.toCharArray()
        .filterIndexed { index, c -> index == str.indexOf(c) }
        .joinToString("")
