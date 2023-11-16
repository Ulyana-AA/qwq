fun main () {
    print("Введите кол-во пришельцев: ")
    val x : Int = readLine()!!.toInt()
    val y = calcChairs(x)
    println("Понадобится $y стульев")
}
fun calcChairs(x: Int) : Int {
    return x + (x/2)
}