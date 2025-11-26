package funtions

class KotlinFunctions{

}

/**
 *  FunctionsExplanation.kt
 *
 *  This file explains:
 *  1. Anonymous Functions
 *  2. Lambda Expressions
 *  3. Higher-Order Functions
 *
 *  Each is explained with detailed comments and examples.
 */

fun main() {

    // --------------------------------------------------------------
    // 1. ANONYMOUS FUNCTION
    // --------------------------------------------------------------
    /**
     * Anonymous Function:
     * - A function WITHOUT a name.
     * - Looks like a regular function but without a function name.
     * - Uses the `fun` keyword.
     * - You can specify parameter types & return types clearly.
     */

    val anonymousAdd = fun(a: Int, b: Int): Int {
        return a + b
    }

    println("Anonymous Function Result: ${anonymousAdd(5, 3)}")
    // Output: 8


    // --------------------------------------------------------------
    // 2. LAMBDA EXPRESSION
    // --------------------------------------------------------------
    /**
     * Lambda Expression:
     * - A SHORTER syntax for anonymous functions.
     * - Uses `{ }` instead of `fun`.
     * - Kotlin automatically infers parameter types when possible.
     * - Commonly used with collection functions (map, filter, etc.)
     *
     * Syntax: { parameters -> body }
     */

    val lambdaAdd: (Int, Int) -> Int = { a, b -> a + b }

    println("Lambda Function Result: ${lambdaAdd(5, 3)}")
    // Output: 8


    // --------------------------------------------------------------
    // 3. HIGHER-ORDER FUNCTION
    // --------------------------------------------------------------
    /**
     * Higher-Order Function:
     * - A function that takes ANOTHER function as a parameter
     *   OR returns a function.
     * - Used for callbacks, functional programming, and reuse.
     */

    fun highOrderFunction(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }

    // Passing a lambda
    val result1 = highOrderFunction(10, 20, lambdaAdd)
    println("Higher-Order Function (lambda): $result1")

    // Passing an anonymous function
    val result2 = highOrderFunction(10, 20, anonymousAdd)
    println("Higher-Order Function (anonymous function): $result2")

    // Passing a lambda directly
    val result3 = highOrderFunction(10, 20) { a, b -> a * b }
    println("Higher-Order Function (inline lambda): $result3")


    // --------------------------------------------------------------
    // SUMMARY OF DIFFERENCES
    // --------------------------------------------------------------
    /**
     * ANONYMOUS FUNCTION vs LAMBDA vs HIGHER-ORDER FUNCTION
     *
     * 1. Anonymous Function:
     *    - Uses "fun"
     *    - Has NO name
     *    - Explicit parameter & return types can be written
     *
     * 2. Lambda Expression:
     *    - Shorter syntax using { }
     *    - Uses "parameters -> body"
     *    - Types often inferred automatically
     *
     * 3. Higher-Order Function:
     *    - A function that RECEIVES/RETURNS another function
     *    - Can accept either lambdas or anonymous functions
     *
     * Simple analogy:
     *     anonymous function   → unnamed normal function
     *     lambda expression    → short anonymous function
     *     higher-order function → function that uses other functions
     */
}
