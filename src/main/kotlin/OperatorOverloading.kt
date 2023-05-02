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

/*
A repeater function that repeats a string `a` times;
 */
operator fun String.times(a: Int): String {
    return this.repeat(a)
}

fun main() {
    val s = "123" * 5
    println(s)
}