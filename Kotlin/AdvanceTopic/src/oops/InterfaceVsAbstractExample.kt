package oops

// File: InterfaceVsAbstractExample.kt


/*

Interface vs Abstract Class in Kotlin (Simple Explanation)

Interface

Defines what a class should do (behaviour).

Cannot hold state (no backing fields), but can have default method implementations.

Supports multiple inheritance (a class can implement many interfaces).

Abstract Class

Used when classes share both behaviour and state.

Can have constructors, properties with backing fields, and non-abstract methods.

A class can inherit only one abstract class.

 */

// INTERFACE EXAMPLE
// Interfaces define behaviors. They cannot hold state using backing fields.
interface Drivable {
    fun startEngine()            // abstract method (no body)
    fun stopEngine()             // abstract method

    // default method with implementation
    fun status() {
        println("Checking vehicle status from Drivable interface")
    }
}

// ABSTRACT CLASS EXAMPLE
// Abstract classes can hold state and provide constructors.
abstract class Vehicle(val name: String) {   // an abstract class can have a constructor
    var speed: Int = 0   // has state (backing field)

    // abstract method (subclass must implement)
    abstract fun accelerate()

    // normal method (optional to override)
    fun displayInfo() {
        println("Vehicle name: $name | Speed: $speed")
    }
}

// A CLASS USING BOTH INTERFACE AND ABSTRACT CLASS
class Car(name: String) : Vehicle(name), Drivable {

    override fun startEngine() {
        println("$name engine started")
    }

    override fun stopEngine() {
        println("$name engine stopped")
    }

    override fun accelerate() {
        speed += 10
        println("$name is accelerating... Current speed: $speed")
    }
}

// MAIN FUNCTION TO RUN EXAMPLE
fun main() {
    val car = Car("Tesla")

    car.startEngine()     // from interface
    car.status()          // default method from interface
    car.accelerate()      // from abstract class implementation
    car.displayInfo()     // concrete method from abstract class
    car.stopEngine()      // from interface
}
