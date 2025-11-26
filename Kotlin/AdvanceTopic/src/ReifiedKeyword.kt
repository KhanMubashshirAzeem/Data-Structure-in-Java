class ReifiedKeyword {
}

/*
    REIFIED KEYWORD EXPLANATION
    ---------------------------
    - In Kotlin, generic types normally lose their type information at runtime (type erasure).
    - Because of this, you normally cannot do things like: T::class or "is T".

    - The 'reified' keyword (used with 'inline') allows Kotlin to keep type information of T at runtime.
    - This means you can use 'T::class', 'is T', type checking, casting, etc.
*/

inline fun <reified T> filterItems(list: List<Any>): List<T> {
    // Because T is reified, we can safely check each element's type using 'is T'
    return list.filter { it is T }     // keep only items whose type matches T
        .map { it as T }        // cast them to T (safe because of the filter)
}

fun main() {
    // A mixed list containing different types
    val mixedList = listOf(1, "Hello", 3.14, "World", 42)

    // Use reified function to get only String items
    val strings = filterItems<String>(mixedList)  // T = String

    // Use reified function to get only Int items
    val integers = filterItems<Int>(mixedList)    // T = Int

    // Print results
    println(strings)   // Output: [Hello, World]
    println(integers)  // Output: [1, 42]
}
