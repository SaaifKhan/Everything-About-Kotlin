fun main(args: Array<String>) {
    println("saif".FormattedString())
}


//extension function
fun String.FormattedString(): String {
    return "----------\n$this\n------------"
}

