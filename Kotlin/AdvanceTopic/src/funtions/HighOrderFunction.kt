package funtions

/*
A higher-order function in Kotlin is a function that
either takes another function as a parameter or returns a function.
 */
class HighOrderFunction {
}

// Define a higher-order function that takes an integer and a function as parameters
fun performOperation(number: Int, operation: (Int) -> Int): Int {
    return operation(number)
}

// Define a function to be passed as an argument
fun doubleValue(value: Int): Int {
    return value * 2
}

fun main() {
    val result1 = performOperation(5, ::doubleValue) // Passing a function reference
    println("Doubled value: $result1") // Output: Doubled value: 10

    // Passing a lambda expression directly
    val result2 = performOperation(10) { it * 3 }
    println("Tripled value: $result2") // Output: Tripled value: 30
}