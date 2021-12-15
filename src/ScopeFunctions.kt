fun main() {
    //wihtout scope
    val emp = Employee()
    val emp2: Employee? = null
    emp.age = 20
    emp.name = "saif"

    //apply
    emp.apply {
        age = 30
        name = "sean"
    }
    println(emp)


    emp.let {
        println(it.age)
        println(it.name)
        2
    }

    emp2?.let {
        it.age = 20

    }


    with(emp) {
        age = 50
        name = "sadaasf"
    }

    emp.run {
        age = 35
        name = "PQR"
    }


}


data class Employee(var name: String = "", var age: Int = 20)
