# NOTES
These are the important notes to remember.

### Type casting 
Lets start with an example:

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
Now we explicitly cast obj to String, so it wont throw any error.