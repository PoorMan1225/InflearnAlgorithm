package Password

fun main() {
    val n = readLine()
    val str = readLine()
    solution(n!!, str!!)
}

fun solution(n: String, str: String) {
    var _str = str
    val list = mutableListOf<String>()

    repeat(n.toInt()) {
        list.add(_str.substring(0..6))
        _str = _str.substring(7)
    }

    list.map {
        it.replace("*", "0")
            .replace("#", "1")
            .run { Integer.parseInt(this, 2).toChar() }
    }.joinToString("")
}
