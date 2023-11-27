
//
//
//      [.]     [.]
//          ___
//         /   \
//

fun main () {
    println("Введите строку или оставьте ее пустой: ")
    val str: String? = readln()
    print(getLength2(str))
}
fun getLength2(str: String?) : Int {
    if (str!!.isEmpty()) return 0
    else return str!!.length
}