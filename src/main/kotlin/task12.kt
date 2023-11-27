fun main () {
    print("Введите n: ")
    val n = readln().toInt()
    print(getCubeList(n))
}

fun getCubeList (n : Int) : MutableList<Int> {
    var list : MutableList<Int> = mutableListOf()
    for (a in 0..n - 1) {
        list.add(a * a * a)
    }
    return list
}