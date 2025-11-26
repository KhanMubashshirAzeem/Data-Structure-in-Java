// Mentor.kt

class Mentor(firstName: String, lastName: String) {

    init {
        println("First init block: $firstName")
    }

    private val fullName = "$firstName $lastName".also {
        println("Full name property")
    }

    constructor(firstName: String, lastName: String, interest: String) : this(firstName, lastName) {
        println("Secondary Constructor: $interest")
    }

    init {
        println("Secondary init block: ${fullName.length}")
    }
}

fun main() {
    // Create an instance of Mentor
    val mentor1 = Mentor("John", "Doe", "Kotlin Programming")
}
