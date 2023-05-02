/*
This is an example of infix functions are a feature of Kotlin lang.
def:
    Infix functions are a special type of function in Kotlin that can be called with infix notation, which allows the function call to be written without using parentheses or the dot notation.
usage:
    To define an infix function in Kotlin, the function must be declared as a member or extension function with a single parameter. The infix modifier keyword must also be used in the function declaration.
 */

/*
An example of infix function that `extend` String class and adds a show method.
What this does is, Takes a string and replaces the characters in the string with '-' that does not match the given argument `a`
 */
infix fun String.show(a: Char):String {
    var result = ""
    this.forEach {x ->
        if(x == a) {
            result += x
        }else {
            result += "-"
        }
    }
    return result
}

fun main() {
    //Infix;
    var eg = "Hello there! General kenobi" show 'e'
    println(eg)
}
