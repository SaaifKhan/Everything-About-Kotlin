fun main() {
    val day = Day.FRIDAY
//    println(day)
//    println(day.number)
//
//    for(i in Day.values()){
//        println(i)
//    }
    day.printFormattedDay()
    val data = getData()
    when(data){
        is Data.Success -> {}
        is Data.Eror -> {}
    }

    //sealed Class
   // val tile = Red("mushroom", 25)

    val tile :Tile = Red("abc","asa")
    val points: String = when(tile){
        is Red -> tile.points
        is Blue -> (tile.points * 5).toString()
    }
    println(points)


}

enum class Day(val number:Int){
    MONDAY(1),//these all are objects of enum class
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5);
    //we have to declare semi colon on last when we have to make functions in enum class ';'
    //we can define consturctors also in enum class

    fun printFormattedDay(){
        println("Day is $this")


    }




}

sealed class Tile
class Red ( val type:String, val points:String):Tile()
class Blue (val points:Int): Tile()


enum class Color(val colorName:String,val colorValue:Int):doColor{
    Red("Red",10) {
        override fun doColor() {
            TODO("Not yet implemented")
        }
    },
    Blue("blue",20) {
        override fun doColor() {
            println("color with blue")
        }
    },
        }


interface doColor{
    fun doColor()
}

abstract class A{

}

sealed class Data{
    data class Success(val data:String) :Data()
    data class Eror(val error: String) :Data()
    object Loading
}

fun getData() : Data{
    return Data.Success((100..1000).random().toString())

}

