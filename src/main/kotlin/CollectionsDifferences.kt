

fun main() {
    /*Array
    * They are mutable, but of fixed size. ie, you can change array items but cant add or remove new items.*/
    val a = arrayOf(1,2,3,4,"hello",'a', 1.4)
    a[2] = "test"

    /*List
    * They are immutable. ie, if its declared, you cant change the size or any elements of the list. Its strictly read only.*/
    val b = listOf(1,2,3,4,"hello")
    //b[2] = "haha" //<-- Cant do this

    /*Mutable list
    * They are mutable, ie you can change the size of the list and can add, remove elements and change existing elements*/
    val c = mutableListOf(1,2,3,4,"haha")
    c[1] = "hey"
    c.add(1.32)

    /*ArrayList
    * Same as that of mutableList. This is a dynamic array, that can shrink/grow to fit the elements inside of it. And has read/write.*/
    val d = arrayListOf(1,2,3,"hello")
    d[3] = true
    d.add('A')


    println("Array: $a")
    println("List: $b")
    println("Mutable List: $c")
    println("Array list: $d")
}