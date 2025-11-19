package _00_2BasicCodingProblems;

public class SumOfSquaresDiff {

    // Method to calculate the absolute difference between
    // (sum of squares of first n natural numbers) and (square of their sum)
    public static int squareDiff(int n) {

        int sumOfSquares = 0; // Will store the sum of squares: 1² + 2² + ... + n²
        int sum = 0;          // Will store the sum: 1 + 2 + ... + n

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sumOfSquares += Math.pow(i, 2); // Add square of each number to sumOfSquares
            sum += i; // Add each number to sum
        }

        // Calculate square of the sum: (1 + 2 + ... + n)²
        int squareOfSum = (int) Math.pow(sum, 2); // Cast to int because Math.pow returns double

        // Find absolute difference between sum of squares and square of sum
        int absDifference = Math.abs(sumOfSquares - squareOfSum);

        return absDifference;
    }

    public static void main(String[] args) {
        int n = 10; // You can change this to any value for testing

        // Print the result
        System.out.println(squareDiff(n)); // For n = 10 → Output = 2640
    }
}


