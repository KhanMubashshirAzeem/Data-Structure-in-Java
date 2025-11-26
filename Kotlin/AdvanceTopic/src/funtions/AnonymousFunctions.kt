package funtions/*
Example:
Consider a scenario where you want to filter a list of numbers,
keeping only the even ones, using a higher-order function like filter.
You can use an anonymous function for the filtering logic:
 */

class AnonymousFunctions

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Using anonymous function to filter even numbers
    val evenNumbers = numbers.filter(fun(number: Int): Boolean {
        return number % 2 == 0
    })

    println("Original numbers: $numbers")
    println("Even numbers: $evenNumbers")

    // Another example: an anonymous function assigned to a variable
    val sumTwoNumbers = fun(a: Int, b: Int): Int {
        return a + b
    }
    println("Sum of 10 and 20: ${sumTwoNumbers(10, 20)}")

}
