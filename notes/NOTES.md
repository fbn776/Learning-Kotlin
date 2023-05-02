# NOTES
These are the important notes to remember.

## Infix fucntions
Infix functions are a special type of function in Kotlin that can be called with infix notation, which allows the function call to be written without using parentheses or the dot notation.
eg:
```kotlin
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

//usage
"hello" show 'e'
```

## Operator overloading
Operator overloading is a feature in Kotlin that allows you to define and use operators such as +, -, *, /, and % with custom types or classes. By overloading operators, you can make your code more concise and expressive, and can provide a more natural syntax for working with custom types.
eg:
```kotlin
operator fun String.times(a: Int): String {
    return this.repeat(a)
}

//usage
"hello" * 3 //hellohellohello
```

## Type casting/checking
### `as` Operator
Let's start with an example:

```kotlin
val obj: Any = "Hello"
val str: String = obj
```
Throws an error as `obj` is `Any`, but we know `obj` will always be a string. 
Because of this, obj cannot be assigned to `str` with the type `String`. To solve this we use `as`

```kotlin
val obj: Any = "Hello"
val str: String = obj as String
```
Now we explicitly cast obj to String, so it won't throw any error.

### `is` Operator
Used to check if a value is of certain datatype or not, it returns a boolean.
```kotlin
if("Hello" is String) {
    println("Yaaa, its a string")
}else {
    println("Nooo, its not a string")
}
```

## Inline functions
In Kotlin, an inline function is a function that is expanded at the call site, rather than at runtime. When you mark a function with the inline keyword, the compiler will copy the function code to the call site, as if you had manually copy-pasted the function's code into the calling code.

Using inline functions can eliminate the overhead of function calls, because there is no function invocation at runtime. This can result in faster code execution, particularly when the function is called frequently or when it is used in a loop.

Note that inlining functions can increase the size of the generated code, so it may not always be appropriate to use inline functions in all situations.

```kotlin
inline fun someFunc() {
    println("Hello")
}
```

## Inheritance
Kotlin being an OOP, obviously supports inheritance. To inherit a class by an another class, the parent class must be `open`.
ie the keyword `open` should be used before the `class` keyword.
To inherit `:` is used.

eg:
```kotlin
open class ParentClass() {...}
class ChildClass(): ParentClass() {...}
```
Note: 
    
    Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
    Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.


## Range

### start `..` end
```kotlin
for(i in 0..3) {
    print(i)
}
//0123
```
Here `1..3` is the range, its inclusive, that means it starts from 0 and ends at 3.
ie `0 <= i <= 3`.

### start `until` end
```kotlin
for(i in 0 until 3) { 
    print(i)
}
//012
```
Here `0 until 3` is the range, its exclusive, ie 0<= i < 3.


### start `..` end `step` step
```kotlin
for(i in 2..8 step 2) {
    print(i)
}
//2468
```
Iterates over a range with a custom increment step for consecutive elements

### start `downTo` end
```kotlin
for (i in 3 downTo 0) {
    print(i)
}
//3210
```
Iterates over a range in reverse order.

### Char ranges
```kotlin
for (c in 'a'..'d') {
    print(c)
}
//abcd

for (c in 'z' downTo 's' step 2) {
    print(c)
}
//zxvt
```
Characters are also supported in ranges
### Ranges in `if`
```kotlin
val x = 2
//Checks if `2` is in the range of 1 to 5
if (x in 1..5) {
    print("x is in range from 1 to 5")
}
//prints: `x is in range from 1 to 5`
```
ranges can be used inside `if` statements to check if something is inside a range or not

For further reading see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges) in official Kotlin docs.


## Equality Checks
Kotlin uses `==` for structural comparison and `===` for referential comparison.
ie `==` checks if two values are equal or not.
`===` checks if two values are same or not, ie it check if both values are stored in the same memory address


## Data classes
Data classes make it easy to create classes that are used to store values. Such classes are automatically provided with methods for copying, getting a string representation, and using instances in collections. You can override these methods with your own implementations in the class declaration.
See [data classes](https://play.kotlinlang.org/byExample/03_special_classes/01_Data%20classes) from the official Kotlin docs.

## Enum classes
Enum classes are used to model types that represent a finite set of distinct values, such as directions, states, modes, and so forth.
See [enum classes](https://play.kotlinlang.org/byExample/03_special_classes/02_Enum) from the official Kotlin docs.

