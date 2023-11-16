fun main (){
    print("Введите строку с числами: ")
    val str = readln()
    val sumDigits = calculateEvenDigits(str)
    print("Зарплата = $sumDigits")
}

fun calculateEvenDigits (str : String) : Int {
    var sum = 0
    for (item in str) {
        if (item.digitToInt() % 2 == 0) {
            sum += item.digitToInt()
        }
        else {
            continue
        }
    }
    return sum
}