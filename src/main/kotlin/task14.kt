fun main () {
    println("Введите строку или оставьте ее пустой: ")
    val str : String? = readln()
    print(getLength(str))
}
fun getLength(str: String?) : Int? {
    if (str!!.isEmpty()) return null
    else return str?.length
}