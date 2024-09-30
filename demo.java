import java.util.Scanner;

public class demo {

    public static int sumOfCubes(int n) {
        int sum = 0; // Initialize the sum

        // Loop through each number from 1 to n and add the cube to the sum
        for (int i = 1; i <= n; i++) {
            sum += i * i * i; // Cube of the number i
        }

        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the value of n

        // Call the method to compute the sum of cubes and print the result
//        System.out.println(sumOfCubes(n));
        System.out.println(sumOfSeries(n));
    }

    static long sumOfSeries(long n) {
        // Base case: when n reaches 0
        if (n == 0) {
            return 0;
        }

        // Recursive case: cube of n + sum of cubes of numbers from 1 to (n-1)
        return (n * n * n) + sumOfSeries(n - 1);
    }
}
