package Anagram

fun main() {
    val str = readLine()!!
    val s = readLine()!!
    solution(str, s)
}

fun solution(str: String, s: String) {
    val map1 = HashMap<Char, Int>()
    val map2 = HashMap<Char, Int>()
    var cnt = 0

    s.forEach {
        map1[it] = map1.getOrDefault(it, 0)+1;
    }
    for(i in 0 until s.length-1) {
        map2[str[i]] = map2.getOrDefault(str[i], 0)+1
    }
    for((lt, rt) in (s.length-1 until str.length).withIndex()) {
        map2[str[rt]] = map2.getOrDefault(str[rt], 0)+1
        if(map1 == map2)
            cnt++
        val ct = map2[str[lt]]!!
        if(ct > 1)
            map2[str[lt]] = ct-1
        else
            map2.remove(str[lt])
    }
    cnt.run(::println)
}
