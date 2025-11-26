package array;

/**
 * Program to find the second largest number in an array.
 * Includes:
 * 1. Explanation of the algorithm
 * 2. Fixes for edge cases
 * 3. Time & space complexity
 * 4. Issues in the original code
 */

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] arr = {15, 18, 49, 22, 48};

        System.out.println("Second Largest Number: " + findSecondLargest(arr));

    }

    /**
     *  -----------------------------------------------------------------------
     *  🔍 ISSUES IN YOUR ORIGINAL CODE
     *  -----------------------------------------------------------------------
     *
     * 1. You initialized:
     *         int largest = arr[0];
     *         int secondLarge = 0;
     *
     *    ❌ BUG: For arrays containing negative numbers:
     *           Example: [-3, -8, -1]
     *           secondLarge would incorrectly become 0.
     *
     *    ✔ FIX: Initialize secondLarge as Integer.MIN_VALUE.
     *
     * 2. You did not handle cases:
     *      - When array has only one element
     *      - When all elements are equal
     *
     * 3. Logic is otherwise correct for standard positive arrays.
     *
     *  -----------------------------------------------------------------------
     *  ⭐ BEST APPROACH (One Pass, O(n))
     *  -----------------------------------------------------------------------
     *
     *  For each element arr[i]:
     *
     *  CASE 1 → arr[i] > largest
     *      secondLarge = largest
     *      largest = arr[i]
     *
     *  CASE 2 → arr[i] lies between secondLarge and largest
     *      secondLarge = arr[i]
     *
     *  -----------------------------------------------------------------------
     *  TIME COMPLEXITY   → O(n)
     *  SPACE COMPLEXITY  → O(1)
     *  -----------------------------------------------------------------------
     */

    private static int findSecondLargest(int[] arr) {

        // If array has less than 2 elements, no second largest exists
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least TWO elements.");
        }

        // Initialize properly to handle all cases (including negative values)
        int secondLarge = getSecondLarge(arr);

        // Handle case where all elements are equal or no second largest exists
        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println("⚠ No second largest number (all elements equal or invalid input).");
        }

        return secondLarge;
    }

    private static int getSecondLarge(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        // Traverse the array once
        for (int i = 0; i < arr.length; i++) {

            // CASE 1: found new largest
            if (arr[i] > largest) {
                secondLarge = largest; // old largest becomes second largest
                largest = arr[i];
            }

            // CASE 2: arr[i] lies between secondLarge and largest
            else if (arr[i] > secondLarge && arr[i] < largest) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

}
