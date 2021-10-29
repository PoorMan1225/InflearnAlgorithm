package ValidPalindrome

import java.util.*

fun main() {
    val str = readLine()
    solution(str!!).run(::println)
}

fun solution(str: String): String {
    val regex = """[^A-Z]""".toRegex()

    val transForm = str
        .uppercase(Locale.getDefault())
        .run {
            regex.replace(this, "")
        }

    return if(transForm == transForm.reversed()) {
        "YES"
    } else {
        "NO"
    }
}
