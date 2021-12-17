class Company(){
    lateinit var name:String
    lateinit var objective:String
    lateinit var founder:String


}

fun main() {
    //apply scope function
   val abc =  Company().apply {
        this.founder = "abc"
        this.name = "xyz"
        objective = "sadsad"
    }

//with function
    with(abc){
        println("$name")
    }

   val companylet = Company().let {
       "the name of company is : ${it.name}"
   }
    print(companylet)





}

private fun performRunOperation(){
    Company().run {
        name ="xyzz"
        objective ="adad"
        return@run "The detail of company is {displayInfo()}"
    }
}