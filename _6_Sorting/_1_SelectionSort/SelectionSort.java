package _6_Sorting._1_SelectionSort;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for the array size
        System.out.println("Enter number of elements you want in array: ");
        int n = sc.nextInt();   // Length of the array
        int[] arr = new int[n]; // Array declaration

        // Asking the user to input the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Storing elements in the array
        }

        // Sorting the array in increasing and decreasing order
        increasingSort(arr);
        decreasingSort(arr);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each element
        }
        System.out.println();  // For new line after printing array
    }

    // Method to sort the array in increasing order using Selection Sort
    public static void increasingSort(int[] arr) {
        System.out.print("Sorted Array using Selection Sort in increasing order: ");
        int n = arr.length;

        // Selection Sort logic
        for (int i = 0; i < n - 1; i++) {
            int minPos = i; // Assume the first unsorted element is the minimum

            // Traverse the unsorted subarray to find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;  // Update minPos with the new minimum element's position
                }
            }

            // Swap the minimum element with the first unsorted element
            swap(arr, i, minPos);
        }

        printArray(arr);  // Print the sorted array
    }

    // Method to sort the array in decreasing order using Selection Sort
    public static void decreasingSort(int[] arr) {
        System.out.print("Sorted Array using Selection Sort in decreasing order: ");
        int n = arr.length;

        // Selection Sort logic
        for (int i = 0; i < n - 1; i++) {
            int maxPos = i; // Assume the first unsorted element is the maximum

            // Traverse the unsorted subarray to find the maximum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxPos]) {
                    maxPos = j;  // Update maxPos with the new maximum element's position
                }
            }

            // Swap the maximum element with the first unsorted element
            swap(arr, i, maxPos);
        }

        printArray(arr);  // Print the sorted array
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];  // Temporary variable to hold the value at index i
        arr[i] = arr[j];    // Set the value at index i to the value at index j
        arr[j] = temp;      // Set the value at index j to the temporary value
    }
}
