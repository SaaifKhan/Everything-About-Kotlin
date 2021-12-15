fun main(args: Array<String>) {
    calculator(5.0, 5.0) { a, b -> a + b }

    //lamba expression
    val lambda1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    val singleParam: (Int) -> Int = { x -> x + x }
    val simplifySingleParam: (Int) -> Int = { it + it }
}


fun sum(a: Double, b: Double): Double {
    return a + b
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    print(result)
}



