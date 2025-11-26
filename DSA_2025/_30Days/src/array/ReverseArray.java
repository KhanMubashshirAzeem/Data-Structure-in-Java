package array;

/**
 * This program reverses an array.
 * It includes:
 * 1. Explanation of your original approach.
 * 2. Time & space complexity of your logic.
 * 3. A more optimized (in-place) two-pointer solution.
 */

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {45, 65, 32, 8, 71, 89};

        System.out.println("🔹 Original Array:");
        printArray(arr);

        System.out.println("\n🔹 Reverse Using Extra Array:");
        reverseWithExtraSpace(arr);

        System.out.println("\n🔹 Reverse Using Two Pointers (Optimized In-Place):");
        int[] optimized = arr.clone();  // clone so original array is preserved
        reverseInPlace(optimized);
        printArray(optimized);
    }

    /**
     * ----------------------------------------------------------------------
     * 🔵 YOUR ORIGINAL APPROACH (Using extra array)
     * ----------------------------------------------------------------------
     *
     * Logic:
     * - Create a new array 'rev'
     * - Start from end of original array and fill into 'rev'
     *
     * CORRECT, but not optimal because:
     * - Uses extra O(n) memory
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)  (because new array created)
     * ----------------------------------------------------------------------
     */
    private static void reverseWithExtraSpace(int[] arr) {

        int n = arr.length;
        int[] rev = new int[n];   // new array for reversed values
        int revIdx = 0;           // index for reversed array

        // Fill reversed array
        for (int i = n - 1; i >= 0; i--) {
            rev[revIdx] = arr[i];
            revIdx++;
        }

        // Printing reversed array
        printArray(rev);
    }

    /**
     * ----------------------------------------------------------------------
     * 🔴 OPTIMIZED APPROACH: Reverse In-Place Using Two Pointers
     * ----------------------------------------------------------------------
     *
     * Idea:
     * - Use two pointers: one at start, one at end
     * - Swap values and move pointers toward center
     *
     * No extra memory used!
     *
     * Example:
     *   [1, 2, 3, 4]
     *    ↑        ↑
     *   swap → move inward → done
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)  (most optimal)
     */
    private static void reverseInPlace(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    /** Utility method to print an array */
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/**
 * ----------------------------------------------------------------------
 * FINAL SUMMARY
 * ----------------------------------------------------------------------
 *
 * ✔ Your method works, but uses extra O(n) space.
 * ✔ Optimized two-pointer method reverses array in-place.
 *
 * 📌 time complexity (both): O(n)
 * 📌 extra space:
 *       - Your method: O(n)
 *       - Optimized: O(1)  (best possible)
 *
 * Two-pointer technique is used in:
 * - Reverse array / string
 * - Palindrome checking
 * - Two-sum in sorted array
 * - Move zeros problem
 *
 * ----------------------------------------------------------------------
 */
