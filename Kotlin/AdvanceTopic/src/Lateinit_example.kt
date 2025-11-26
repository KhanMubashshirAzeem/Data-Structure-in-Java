/*

The lateinit modifier in Kotlin allows declaring a mutable property (var) without initializing it at the point of declaration,
with the promise that it will be initialized later before its first use.

This is particularly useful for properties that cannot be initialized in the constructor,
such as Android View components or dependencies injected by a framework.

 */

class Lateinit_example {
    lateinit var username: String
    lateinit var email: String

    fun initializeProfile(name: String, mail: String) {
        username = name
        email = mail
    }

    fun printProfile() {
        // It's good practice to check if a lateinit property is initialized
        // before accessing it, especially in more complex scenarios.
        if (this::username.isInitialized && this::email.isInitialized) {
            println("Username: $username, Email: $email")
        } else {
            println("Profile not fully initialized.")
        }
    }
}

fun main() {
    val user = Lateinit_example()

    // Attempting to access before initialization will throw UninitializedPropertyAccessException
    // user.printProfile() // This would crash the program

    user.initializeProfile("Alice", "alice@example.com")
    user.printProfile() // Output: Username: Alice, Email: alice@example.com

    val anotherUser = Lateinit_example()
    anotherUser.printProfile() // Output: Profile not fully initialized.
}