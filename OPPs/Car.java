package OPPs;//======== Classes And Object ======================

import java.util.Scanner;

public class Car
{
    private String make;
    private String model;
    private int year;

    // Constructor
    public  Car(String make, String model, int year)
    {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    // Instance method
    public void startEngine()
    {
        System.out.println("Engine Started!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating Object
        Car car1 = new Car("Toyota","Camry", 2022);
        Car car2 = new Car("Ford", "Mustang", 2021);
        Car car3 = new Car("Tesla", "ModelS", 2023);

        // Creating objects
        System.out.println(car1.make);
        System.out.println(car2.model);
        System.out.println(car3.year);

        // Invoking object methods
        car1.startEngine();

    }
}
