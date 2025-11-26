package Arrays

class LearnArrays

fun main() {

    basics()
    howToUse()
    extention()

}

fun extention() {
    println("\n\n\n5. Array Extensions in Kotlin\n\n\n")

    val arr = arrayOf(1, 2, 3, 4, 5)

    println(arr.sum()) // sum of all element - 15

//    val shuffledArr = arr.shuffled()
//    println(shuffledArr.joinToString())

    val evenNumbers = arr.filter { it % 2 == 0 }
    println(evenNumbers.joinToString()) // only even number

    val qubes = arr.map { it * it }
    println(qubes.joinToString()) // List of qubes of each number in array

    //    sorted(): Returns a sorted array.
    val sortedArr = arr.sortedArray()
    println(sortedArr.joinToString())

    //    take(): Returns the first n elements.
    val firstThree = arr.take(3)
    println(firstThree.joinToString())  // Output: 1, 2, 3

    //    drop(): Returns all elements except the first n.
    val withoutFirstTwo = arr.drop(2)
    println(withoutFirstTwo.joinToString())  // Output: 3, 4, 5

    //    distinct(): Returns an array with duplicate elements removed.
    val withDuplicates = arrayOf(1, 2, 2, 3, 3, 3)
    val distinctArr = withDuplicates.distinct()
    println(distinctArr.joinToString())  // Output: 1, 2, 3

    //    ** contains()**: Checks if an element is present in the array.
    val hasThree = arr.contains(3)
    println(hasThree)  // Output: true

    //    indexOf(): Returns the index of the first occurrence of an element.
    val index = arr.indexOf(3)
    println(index)  // Output: 2

    //    lastIndexOf(): Returns the index of the last occurrence of an element.
    val lastIndex = arr.lastIndexOf(3)
    println(lastIndex)  // Output: 2

    //    count(): Returns the number of elements satisfying a condition.
    val count = arr.count { it % 2 == 0 }
    println(count)  // Output: 2

    //    any(): Checks if any element satisfies a condition.
    val hasEven = arr.any { it % 2 == 0 }
    println(hasEven)  // Output: true

    //    all(): Checks if all elements satisfy a condition.
    val allEven = arr.all { it % 2 == 0 }
    println(allEven)  // Output: false
}

fun howToUse() {
    val fruits = arrayOf("Apple", "Banana", "Cherry", "Mango", "Guava", "Pine Apple")
    // array of strings
    val last = fruits.size
    val firstFruit = fruits[0]
    val lastFruit = fruits[last - 1]

    println(firstFruit)
    println(lastFruit)

    fruits[1] = "Blueberry" // Updating the second element from Banana to Blueberry
    println(fruits[1])

    for (fruit in fruits) {
        println("   $fruit")
        // prints each fruits on a line
    }

    fruits.forEach {
        println(it)
        // prints each fruits on a line using for each
    }

    println(fruits.size) // size of arrays - fruits

    println(fruits.sortedArray()) // sort the array in alphabetical order

    println("Banana" in fruits) // Ans in Boolean form


}

fun basics() {
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    // Creates an array of Strings

    val nums = arrayOf(1, 2, 3, 4, 5)
    // Creates a array of integers


    // Using constructor
    val squares = Array(5) { it * it }
    // creates an array of integers: [0, 1, 4, 9, 16]

    val numbers = intArrayOf(1, 2, 3, 4, 5) // IntArray, DoubleArray, CharArray - used for better performance in kotlin
    // creates array of integers

    // using constructor
    val evens = IntArray(5) { it * 2 }
    // creates an array of integers: [0, 2, 4, 6, 8]
}
