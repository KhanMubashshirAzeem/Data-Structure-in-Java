package Arrays.Array;

import java.util.Scanner;

public class SmallestNumWhoseProductOfDigit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number ");
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        String ans = ""; // Initialize an empty string to store the result
        // Loop through possible divisors from 9 down to 2
        for (int div = 9; div >= 2; div--) {
            while (n % div == 0) {  // While 'n' is divisible by 'div'
                n = n / div;  // Reduce 'n' by dividing it by 'div'
                ans = div + ans; // Add 'div' to the beginning of the result string
            }
        }
        // If 'n' is not equal to 1, it means there are prime factors left
        if (n != 1) {
            return -1; // Return -1 to indicate that 'n' cannot be represented in the desired form
        } else {
            return Integer.parseInt(ans); // Parse the result string as an integer and return it
        }
    }
}

// The Overall time complexity will be O (log n) base 2
// And the space complexity will be o(1) because we are not using any extra space
