var name:String? = null
var greeting:String? = null

fun main() {
    println("Hello")
    greeting = (if(name != null) "Welcome $name" else "I'm sorry, you're name is not specified :(")

    println(greeting)
}