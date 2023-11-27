fun main() {
    print("Введите начальный запас сахара: ")
    val storage = SugarStorage(readln().toInt())
    println("Текущий запас сахара: ${storage.volume}")
    println("Сколько убрать?")
    println("Текущий запас сахара:  ${storage.decreaseSugar(readln().toInt())}")
    println("Сколько добавить? ")
    println("Текущий запас сахара:  ${storage.increaseSugar(readln().toInt())}")
}
class SugarStorage (var _v : Int = 100){
    public var volume : Int
    init {
        volume = _v
    }

    fun decreaseSugar(v : Int) : Int{
        if (v >= 0) {
            if (v <= volume)
             volume -= v
            else {
                volume = 0
            }
        }
        return volume
    }

    fun increaseSugar(v:Int) : Int {
        if (v >= 0) {
            volume += v
        }
        return volume
    }
}
