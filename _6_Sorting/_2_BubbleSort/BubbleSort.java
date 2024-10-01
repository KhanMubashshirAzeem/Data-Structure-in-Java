package _6_Sorting._2_BubbleSort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.println("Enter number of elements you want in the array: ");
        int n = sc.nextInt();   // Store the number of elements

        // Initialize an array of size 'n'
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Store the input elements in the array
        }

        // Call the bubbleSort function to sort the array
        bubbleSort(arr);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        // Iterate through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");  // Print the elements with a space
        }
        System.out.println();  // Move to the next line after printing the array
    }

    // Method to sort the array using Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        // Print statement before sorting begins
        System.out.println("Sorted Array using Bubble Sort:");

        // Outer loop controls the number of passes (n-1 iterations)
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop compares adjacent elements and performs swapping
            // This loop gets shorter with each outer loop iteration since the largest element
            // is moved to the right in each pass
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Compare the current element with the next one
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if the current element is larger than the next one
                    int temp = arr[j];        // Store the current element in a temporary variable
                    arr[j] = arr[j + 1];      // Move the next element to the current position
                    arr[j + 1] = temp;        // Assign the temp value to the next position
                }
            }
            // By the end of each outer loop iteration, the largest unsorted element is placed at the end
        }

        // After sorting, call the method to print the sorted array
        printArray(arr);
    }

}
