package CaseConversion

import java.lang.StringBuilder

fun main() {
    val str = readLine()
    solution(str!!).run(::println)
}

fun solution(str: String): String {
    val sb = StringBuilder()

    str.forEach {
        sb.append(
            if (it.isLowerCase())
                (it.code + 32).toChar()
            else
                (it.code - 32).toChar()
        )
    }
    return sb.toString()
}
