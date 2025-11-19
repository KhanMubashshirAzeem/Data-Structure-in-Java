package Arrays.Array;

import java.util.Scanner;

public class FindElement {

    // Method to print the elements of the array
    static void printArray(int[] arr) {
        System.out.print("Elements in the array are: ");
        for (int i = 0; i < arr.length; i++) {  // Loop through each element in the array
            System.out.print(arr[i] + " ");     // Print each element followed by a space
        }
        System.out.println();  // Move to the next line after printing all elements
    }

    // Method to find a specific element (key) in the array
    static void findElement(int[] arr, int key) {
        boolean found = false;  // Initialize a boolean to track if the element is found
        for (int i = 0; i < arr.length; i++) {  // Loop through each element in the array
            if (key == arr[i]) {  // Check if the current element is equal to the key
                System.out.println(key + " is present at index " + (i + 1));  // If found, print the key and its position (1-based index)
                found = true;  // Set found to true
                break;  // Exit the loop since we found the key
            }
        }
        if (!found) {  // If the key was not found in the loop
            System.out.println(key + " is not present in the array.");
        }
        System.out.println();  // Print a blank line for better readability
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create a Scanner object for input
        while (true) {  // Infinite loop to continuously accept input and find elements
            System.out.println("Enter number of elements you want in the array: ");
            int n = sc.nextInt();   // Read the length of the array

            int[] arr = new int[n];  // Create an array of the specified length

            System.out.print("Enter " + n + " elements: ");
            for (int i = 0; i < n; i++) {  // Loop to read the elements into the array
                arr[i] = sc.nextInt();  // Store each element in the array
            }

            printArray(arr);  // Call method to print the elements of the array

            System.out.print("Enter key: ");
            int key = sc.nextInt();  // Read the key to be searched in the array

            findElement(arr, key);  // Call method to find the key in the array
        }
    }
}
