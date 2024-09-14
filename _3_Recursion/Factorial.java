package _3_Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {             // argument must be non-negative
            return 0;
        }
        else if (n == 1) {      // base case
            return 1;
        }
        else
            return n * factorial(n - 1);        // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial : ");
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}
