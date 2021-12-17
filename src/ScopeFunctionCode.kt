fun main() {

   // letScopeFun()
    //  runScopeFun()
    //  withScopeFun()
 //   applyScopeFun()
  //  alsoScopeFun()
    also()
}
class Student(){
    var stName:String = "abc"
    var stClass:String = ""
    var stSection:String = ""
    var stFatherName:String = ""
}

class PersonInfo() {
    var name: String = "Abcd"
    var contactNumber: String = "12344124"
    var address: String = "xyzz"
    var group:String = "a"

    fun displayInfo() {
        print("\n Name: $name\ncontactNumber: $contactNumber\nAddress: $address")
    }


}

private fun letScopeFun() {
    val letPerson = Person().let { person ->

        "the name of person is : ${person.name}"
        "contact num is : ${person.contactNumber}"



    }
    print(letPerson)

}

private fun runScopeFun() {
    val scopeFun = PersonInfo()?.run {
        name= "saifKhan"
        contactNumber = "121231112"
        address = "sailfish"
        this.displayInfo()
    }
    print(scopeFun)
}

private fun withScopeFun() {

    val person: Person? = null
    with(person) {
        this?.name = "asdf"
        this?.contactNumber = "1234"
        this?.address = "wasd"
        this?.displayInfo()
    }
}

private fun applyScopeFun() {
    val person: PersonInfo? = null
    person?.apply {
        name = "saifkhasda"
        contactNumber = "03349090910"
        address = "wasz"
    }
    println(person)

}

private fun alsoScopeFun() {
    val varName = PersonInfo().also { currentPerson ->
        print("Current name is: ${currentPerson.name}\n")
        currentPerson.name = "modifiedName"
    }
    print(varName)
}

private fun also(){
    var stName = Student().also {

    }

    print(stName)
}



