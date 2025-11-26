package array;

/**
 * This program finds the largest number in an integer array.
 * It includes:
 * 1. Explanation of your original logic and its issue.
 * 2. Optimized approach.
 * 3. Time & Space complexity analysis.
 */

public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = {15, 18, 16, 22, 48};

        // Call the optimized solution
        System.out.println("Largest Number: " + findLargest(arr));
    }

    /**
     * 🔍 Your Original Code Issue:
     *
     * Your logic:
     *  if (arr[i] > arr[i - 1]) {
     *      largest = arr[i];
     *  } else {
     *      largest = arr[i - 1];
     *  }
     *
     * ❌ Problem:
     * This compares only two adjacent elements ("current vs previous") each time.
     * It does NOT track the actual largest seen so far.
     *
     * Example:
     * arr = [5, 100, 2, 3]
     * Your logic would give: 3 ❌
     *
     * Because the else part overwrites the "largest" incorrectly.
     *
     * ---------------------------------------------------------------
     * ✅ Correct Logic:
     * Compare each element with the global max seen so far.
     *
     * largest = arr[0]
     * For each element arr[i]:
     *       if (arr[i] > largest)
     *              largest = arr[i]
     *
     * This ensures we always track the real maximum.
     *
     * ---------------------------------------------------------------
     */

    private static int findLargest(int[] arr) {

        // Step 1: assume first element is largest (base case)
        int largest = arr[0];

        // Step 2: loop through array from index 1 to end
        for (int i = 1; i < arr.length; i++) {

            // Step 3: if current element is greater than 'largest', update it
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Step 4: return the final max element
        return largest;
    }
}

/**
 * 🧠 TIME COMPLEXITY:
 * -------------------
 * We check each element exactly once → O(n)
 *
 * n = size of the array
 *
 * 🧠 SPACE COMPLEXITY:
 * --------------------
 * Only uses one extra variable (largest) → O(1)
 *
 *
 * 🚀 BEST APPROACH:
 * The optimized approach above is already the best possible solution.
 *
 * Why?
 * - You must scan all elements → cannot be better than O(n)
 * - Uses constant extra space → O(1)
 *
 * ⚡ No sorting should be used → sorting takes O(n log n) which is unnecessary.
 */
