package _6_Sorting.InsertionSort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element you want in array? ");
        int n = sc.nextInt();   // Length
        int[] arr = new int[n];  // Length of Array

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++)  // Traversing from 0 to n mean till length
        {
            arr[i] = sc.nextInt();  // Storing the element in the array
        }

        increasingSort(arr);
        decreasingSort(arr);

    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }

    public static void increasingSort(int[] arr) {
        // Printing the initial message before sorting.
        System.out.print("Sorted array using Insertion Sort in increasing order ");
        // Loop through the array starting from the second element (index 1).
        for (int i = 1; i < arr.length; ++i) {
            // Store the current element (the one we want to insert in the correct position).
            int curr = arr[i];
            // Initialize 'prev' to the index just before the current element.
            int prev = i - 1;
            // Finding the correct position to insert 'curr' by shifting elements greater than 'curr' to the right.
            // Loop until 'prev' becomes negative (reached the start of the array) or the element at 'prev' is less than or equal to 'curr'.
            while (prev >= 0 && arr[prev] > curr) {
                // Shift the element at 'prev' one position to the right.
                arr[prev + 1] = arr[prev];
                // Move 'prev' one step to the left to check the next element on the left in the next iteration.
                prev--;
            }
            // Insert 'curr' at the correct position found in the previous while loop.
            arr[prev + 1] = curr;
        }
        // Call the 'printArray' function to display the sorted array.
        printArray(arr);
    }


    public static void decreasingSort(int[] arr) {
        System.out.print("Sorted array using Insertion Sort in decreasing order ");
        for (int i = 1; i < arr.length; ++i) {
            int curr = arr[i];
            int prev = i - 1;
            //finding correct position to insert
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev + 1] = curr;
        }
        printArray(arr);
    }


}
