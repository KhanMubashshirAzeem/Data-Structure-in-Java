package Patterns;

public class Binary_Number_Triangle_Pattern {

    public static void main(String[] args) {
        int n = 5; // Define the number of rows for the pattern
        printPattern(n); // Call the method to print the pattern
    }

    // Method to print the binary number triangle pattern
    private static void printPattern(int n) {
        int i, j, start = 1; // Initialize variables i, j, and start

        // Outer loop to iterate through the rows
        for (i = 0; i < n; i++) {

            // Determine the starting number for the row (1 for even rows, 0 for odd rows)
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;

            // Inner loop to print the elements in each row
            for (j = 0; j <= i; j++) {
                System.out.printf(start + " "); // Print the current start value
                start = 1 - start; // Alternate between 1 and 0
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
