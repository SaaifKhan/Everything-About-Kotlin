fun main() {
    rollDice(1..6, 4) { result ->
        println(result)
        "as"
    }


    val make: (String, String) -> String = { realname, heroname ->
        "$realname"
    }

}

fun rollDice(
    range: IntRange,
    time: Int,
    callback: (result: Int) -> String
) {
    for (i in 0 until time) {
        val result = range.random()
        callback(result)

    }
}

fun rollDice(callBack: (result: Int) -> Unit): String {
    return "Dice Rolled"

}

fun makeMyHero(realName: String, heroName: String, make: (String, String) -> String) {

var a:String? = null
    a = null
    run(a)

    a.let {
    }
}

fun run(i:String?){}


