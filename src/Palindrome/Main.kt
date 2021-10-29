package Palindrome

fun main() {
    val str = readLine()
    str!!.solution().run(::println)
}

fun String.solution() = if(this.equals(reversed(), true) ) "YES" else "NO"

