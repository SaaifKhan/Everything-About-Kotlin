

fun main() {
    demo("saif")
}

fun demo(x:Any){
        when(x){
            is Int -> print(x+1)
            is String -> print(x.length+1)
            is IntArray -> print(x.sum())
        }


}
