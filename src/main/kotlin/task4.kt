fun main (){
    print("Введите день недели: ")
    val dayNumber = readln().toInt()
    print("Введите ранг: ")
    val bugRank = readln().toInt()
    print("Введите денежную единицу: ")
    val cashAmount = readln().toInt()
    val sugarKg = moneyBug(dayNumber, bugRank, cashAmount)
    print("Бюджет = $sugarKg кг сахара")

}
fun moneyBug (d: Int, b: Int, a: Int) : Int{
    return d * (b + 42) * a
}
