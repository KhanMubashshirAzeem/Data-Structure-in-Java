package _2_BasicMaths;

import java.util.*;

public class FindSumOrProduct {

    // Define the modulo constant
    private static final int MOD = 1000000007;

    public static long sumOrProduct(int n, int q) {
        // If Q is 1, return the sum of the first N natural numbers
        if (q == 1) {
            // Sum of first N numbers formula: N * (N + 1) / 2
            return (long) n * (n + 1) / 2;
        }

        // If Q is 2, return the product of the first N numbers modulo 10^9 + 7
        else if (q == 2) {
            long product = 1;
            for (int i = 1; i <= n; i++) {
                product = (product * i) % MOD;
            }
            return product;
        }

        // If Q is neither 1 nor 2, return -1 (shouldn't happen based on constraints)
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int t = scanner.nextInt();

        // Loop through each test case
        while (t-- > 0) {
            // Read values of N and Q
            int n = scanner.nextInt();
            int q = scanner.nextInt();

            // Call the function and print the result
            System.out.println(sumOrProduct(n, q));
        }

        scanner.close();
    }
}
