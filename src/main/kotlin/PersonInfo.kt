interface PersonInfo {
    val startInfo: String
    fun printInfo(person: Person) {
        println(startInfo)
        person.printInfo()
    }
}

interface Session {
    fun getSession(v: Int) {
        println("The session id is $v")
    }
}

class BasicInfo: PersonInfo, Session {
    override val startInfo: String
        get() = "Info provider;"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("this is overridden")
    }
}

fun main() {
    val provider = BasicInfo()

    provider.printInfo(Person("Febin", "Nelson P"))
    provider.getSession(10)
}