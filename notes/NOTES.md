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
