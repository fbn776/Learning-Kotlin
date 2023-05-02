import java.lang.Error

/*
This is an example for operator overloading.
def:
    Operator overloading is a feature in Kotlin that allows you to define and use operators such as +, -, *, /, and % with custom types or classes. By overloading operators, you can make your code more concise and expressive, and can provide a more natural syntax for working with custom types.
usage:
    In Kotlin, you can overload operators by defining special member functions or extension functions with specific names that correspond to the operator symbols. For example, to overload the + operator for a custom class, you can define a function named plus with the operator modifier:
ref:
    https://kotlinlang.org/docs/operator-overloading.html
 */

operator fun String.div(a: Int): List<String> {
    if(a > this.length) {
        throw Error("Cannot divide a string with a number thats greater than its length")
    }

    if(a <= 0) {
        throw Error("Cannot divide a string with a number thats less than or equal to 0")
    }

    val list = mutableListOf<String>()
    val u: Int = this.length/a

    println(this.length)
    for(i in 0..a-1) {
        var r = ""
        for(j in i*u..((i+1)*u)-1) {
            r += this[j]
        }
        list.add(r)
    }


    return list
}

fun main() {
    val divs = "Hello there!" / 0
    println(divs)
}