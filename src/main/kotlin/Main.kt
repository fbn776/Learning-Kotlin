var name:String? = null
var greeting:String? = null

fun main() {
    println("Hello")

    //Printing greeting based on its value with if statements;
    println(if(greeting == null) "Greeting is null" else greeting)
    //The same thing but with when;
    when(greeting) {
        null -> println("Greeting is null")
        else -> println(greeting)
    }
}