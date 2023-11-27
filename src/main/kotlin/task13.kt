fun main () {
    println(engineStatus(readln().toInt()))
}

fun engineStatus(engineNumber : Int) : String {
    try {
        return rawEngineStatus(engineNumber)
    }
    catch (ex : EngineNotFoundException) {
        return "engine $engineNumber not found"
    }
    catch (ex : SensorsMeltException) {
        return "engine $engineNumber offline"
    }

}
fun rawEngineStatus(engineNumber : Int) : String {
    return "$engineNumber"
}

class EngineNotFoundException () : Throwable ()
class SensorsMeltException () : Throwable ()

