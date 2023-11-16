fun main () {
    print("Введите год: ")
    val year = readLine()!!.toInt()
    print(getYearEra(year))
}

fun getYearEra (y : Int) : String {
    when {
        y < 1970 -> return "до"
        y == 1970 -> return "соответствует"
        y in 1970..2000 -> return "после (ХХ век)"
        y in 2000..2023 -> return "после (XXI век)"
        else -> return "далёкое будущее"
    }
}