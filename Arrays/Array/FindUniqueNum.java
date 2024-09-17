package Arrays.Array;

import java.util.Scanner;

public class FindUniqueNum {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the size of the array from the user
        int n = scanner.nextInt();

        // Initialize the array with the given size
        int[] arr = new int[n];  // Create an array to store 'n' elements

        // Populate the array by taking inputs
        for (int i = 0; i < n; i++)  // Traverse from 0 to n
        {
            arr[i] = scanner.nextInt();  // Read and store each element in the array
        }

        // Call the findUnique function and print the result (the unique number)
        System.out.println(findUnique(arr));

        // Close the scanner
        scanner.close();
    }

    // This method finds the unique number using XOR logic
    public static int findUnique(int[] arr) {

        // Initialize the variable to store XOR results
        int unique = 0;

        // XOR all the elements in the array
        // The logic here is that when we XOR two identical numbers, the result is 0.
        // XOR with 0 doesn't change the number. Thus, in the end, all duplicates cancel each other out,
        // leaving the unique number in the 'unique' variable.
        for (int num : arr) {
            unique ^= num;  // XOR the current number with the 'unique' variable
        }

        // After all XOR operations, the 'unique' variable will hold the unique number
        return unique;
    }
}
