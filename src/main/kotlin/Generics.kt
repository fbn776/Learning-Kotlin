class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

//This class works with every data types (a generic class)
class Box<T> (var len: T) {
    fun getArea(): T{
        return len
    }
}

//This is a generic function that takes in type T
fun <T> printAll(vararg items: T) {
    for(i in items) {
        println(i)
    }
}

fun main() {
    printAll(1, 2, 3, "hello", true, false, 1.383)
}