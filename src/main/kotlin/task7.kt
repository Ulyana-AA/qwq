fun main () {
    println("Введите слова через пробелы:")
    val list : List<String> = readln().split(' ')
    val countBug = calculateBugMentions(list)
    print("Количество употреблений = $countBug")
}

fun calculateBugMentions (list : List<String>) : Int {
    var count = 0
    for (item in list) {
        if (item.lowercase() == "bug")
            count += 1
    }
    return count
}
