class Person(val firstName: String, val lastName: String) {

     var age: Int? = null
          set(value) {
               field = value
               println("The age is $value")
          }
     var nickname: String? = null
          set(value) {
               field = value
               println("Nickname changed to $value")
          }
          get() {
               println("Nickname is being acessed")
               return field
          }

     fun printInfo() {
          val nicknameToPrint = if(nickname == null) "" else "($nickname) "

          println("$firstName $nicknameToPrint$lastName")
          println("age: $age")
     }
}