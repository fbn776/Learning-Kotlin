fun sum(vararg nums: Int): Int {
    var result = 0
    nums.forEach { i ->
        result += i
    }

    return result
}

fun sayHello(msg:String = "Hello", vararg names: String) {
    names.forEach{i ->
        println("$msg $i")
    }
}

fun main() {
    val person = Person("Febin", "Nelson P")
    person.age = 19

    person.printInfo()
}
