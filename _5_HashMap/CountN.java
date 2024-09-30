package _5_HashMap;

import java.util.Scanner;

public class CountN {

    int[] array = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size 'n' as an input for the array.
        int n = sc.nextInt();
        int[] arr = new int[n];  // Declaring an array 'arr' to store 'n' numbers.

        // Storing the 'n' numbers in the array.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Reading and assigning input to each element of the array.
        }

        // Precompute step:
        int[] hash = new int[13];  // Declaring a 'hash' array of size 13 to store the frequency count of numbers.
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;  // Incrementing the count for each occurrence of a number in the 'arr'.
        }

        // Taking the number of queries as input.
        int q;
        q = sc.nextInt();  // 'q' represents the number of queries.

        // Query phase: Process each query to fetch the frequency of a specific number.
        while (q-- != 0) {
            int number;
            number = sc.nextInt();  // Reading the number whose frequency needs to be fetched.

            // Fetching the precomputed count from the 'hash' array and printing it.
            System.out.println(hash[number]);
        }
    }
}
