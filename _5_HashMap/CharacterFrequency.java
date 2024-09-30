package _5_HashMap;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the number of characters in the input array
        int n = sc.nextInt();  // First input will be the number of characters
        char[] arr = new char[n];  // Array to store the characters

        // Taking n characters as input and storing them in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);  // Read each character input
        }

        // Precompute: creating a hash array of size 256 (for ASCII values)
        int[] hash = new int[256];  // This will store the frequency of each character

        // Iterating over the character array to populate the hash array with frequencies
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;  // Increment the hash value for each character
        }

        // Reading number of queries (how many characters' frequencies will be queried)
        int q = sc.nextInt();

        // Handling each query
        while (q-- > 0) {
            // Reading the character for which frequency is to be fetched
            char c = sc.next().charAt(0);  // Read a single character input

            // Fetching and printing the frequency of the queried character from the hash array
            System.out.println(hash[c]);
        }

        // Closing the scanner resource
        sc.close();
    }
}
