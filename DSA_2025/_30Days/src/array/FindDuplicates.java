package array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Program to detect duplicates in an array.
 *
 * Includes:
 *  1. Explanation of original code issues
 *  2. Correct optimized solution using sorting
 *  3. More optimal approach using HashSet
 *  4. Time & space complexity
 */

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = {15, 18, 16, 22, 48, 22};

        System.out.println("🔹 Using Sorting: Duplicate = " + findDuplicateUsingSort(arr.clone()));
        System.out.println("🔹 Using HashSet: Duplicate = " + findDuplicateUsingSet(arr.clone()));
    }

    /**
     * --------------------------------------------------------------------------
     * ❌ ISSUES IN YOUR ORIGINAL CODE
     * --------------------------------------------------------------------------
     *
     * 1. You printed "Duplicate not found" inside the loop.
     *    This prints the message for EVERY non-duplicate element.
     *
     *    Example: [1,2,3,4,2]
     *    Output:
     *      Duplicate not found
     *      Duplicate not found
     *      Duplicate not found
     *      Duplicate found: 2
     *
     *    ✔ FIX: Print message only AFTER checking entire array.
     *
     * 2. Variable `dup` was useless. You can directly return arr[i].
     *
     * 3. Your code works only if there is EXACTLY one duplicate.
     *
     * --------------------------------------------------------------------------
     * ✔ APPROACH 1 (SORTING METHOD)
     * --------------------------------------------------------------------------
     *
     * Steps:
     *   - Sort the array → duplicates become adjacent
     *   - Compare every arr[i] with arr[i-1]
     *   - First match = duplicate
     *
     * Complexity:
     *   Time:  O(n log n)   (sorting dominates)
     *   Space: O(1) or O(n) depending on Java sort implementation
     *
     * --------------------------------------------------------------------------
     */

    private static int findDuplicateUsingSort(int[] arr) {

        Arrays.sort(arr);  // sort array

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                return arr[i];   // duplicate found
            }
        }

        // No duplicates found
        return -1;
    }

    /**
     * --------------------------------------------------------------------------
     * ✔ APPROACH 2 (HASHSET METHOD — BEST FOR INTERVIEWS)
     * --------------------------------------------------------------------------
     *
     * Steps:
     *   - Use HashSet to store seen numbers
     *   - If a number is already present → it's a duplicate
     *
     * Complexity:
     *   Time:  O(n)
     *   Space: O(n)
     *
     * Advantages:
     *   - Faster than sorting
     *   - No modification of the array
     * --------------------------------------------------------------------------
     */

    private static int findDuplicateUsingSet(int[] arr) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return num;   // duplicate found
            }
            seen.add(num);
        }

        return -1;  // no duplicates
    }
}

/**
 * --------------------------------------------------------------------------
 * ⭐ SUMMARY
 * --------------------------------------------------------------------------
 *
 * ✔ Your original approach works but had logging issues.
 * ✔ Sorting approach → O(n log n)
 * ✔ HashSet approach → O(n) (best for interviews)
 * ✔ Clean, safe, and handles all edge cases.
 *
 * --------------------------------------------------------------------------
 */
