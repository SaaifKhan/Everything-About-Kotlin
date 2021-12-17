fun main() {

    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())
    println( Manager.getInstance())

}


 class Manager private constructor(){
    companion object{
        private var xyz : Manager? = null
        fun getInstance() = synchronized(this){

                xyz = Manager()
                println("$xyz")


            xyz

        }

    }



}






