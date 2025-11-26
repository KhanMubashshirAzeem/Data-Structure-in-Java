// File: ScopeFunctionsDemo.kt


fun main() {

    // -------------------------
    // 1. let
    // -------------------------
    // let provides the object as "it"
    // It returns the LAST line of the lambda
    // Commonly used with nullable objects to avoid null checks
    val firstName: String = "Alice"

    firstName?.let {
        // "it" refers to the value of name ("Alice")
        println("Hello, $it")   // Prints: Hello, Alice
    }


    // -------------------------
    // 2. run
    // -------------------------
    // run provides the object as "this"
    // It returns the LAST line of the lambda
    // Useful when you want to work with an object and return a result
    val greeting = "hello".run {
        // "this" refers to the string "hello"
        this.uppercase() + " WORLD"
    }
    println(greeting)  // Prints: HELLO WORLD


    // -------------------------
    // 3. with
    // -------------------------
    // with is NOT an extension function
    // You pass the object as a parameter
    // Inside the block, the context is "this"
    // Returns the LAST line of the lambda
    val numbers = mutableListOf(1, 2, 3)

    val sizeAfter = with(numbers) {
        // "this" refers to numbers
        println("Numbers: $this")   // Prints: [1, 2, 3]
        add(4)                      // Add 4 to the list
        size                  // Return list size
    }
    println("New size: $sizeAfter")  // Prints: New size: 4


    // -------------------------
    // 4. apply
    // -------------------------
    // apply uses "this"
    // It always returns the OBJECT itself (not the block result)
    // Best for initializing or configuring objects
    val person = Person().apply {
        // Inside this block, we set properties of person
        name = "Bob"
        age = 30
    }
    // Since apply returns the same object, we print the person
    println(person) // Prints: Person(name=Bob, age=30)


    // -------------------------
    // 5. also
    // -------------------------
    // also uses "it"
    // It returns the OBJECT itself like apply
    // Best for side effects (logging, debugging)
    val originalList = mutableListOf("A", "B")

    val newList = originalList.also {
        // "it" refers to originalList
        println("Before adding: $it")  // Prints: [A, B]
        it.add("C")                    // Modify the list
    }

    // also returns the SAME list
    println(newList) // Prints: [A, B, C]
}


// A simple class used for apply
data class Person(
    var name: String = "", var age: Int = 0
)
