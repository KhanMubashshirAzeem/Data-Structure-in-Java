package array;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("🔹 Original Array:");
        printArray(arr);

        // Approach 1: Simple (Extra Array)
        System.out.println("\n🔹 Simple Approach (Extra Array):");
        int[] arr1 = arr.clone();
        moveZerosSimple(arr1);
        printArray(arr1);

        // Approach 2: Optimized (Two Pointers - Stable Order)
        System.out.println("\n🔹 Optimized Two Pointer (Stable - recommended):");
        int[] arr2 = arr.clone();
        moveZerosOptimized(arr2);
        printArray(arr2);

        // Approach 3: Your approach (Swap zeros to end) — corrected
        System.out.println("\n🔹 Swap Zero to End Approach (Unstable):");
        int[] arr3 = arr.clone();
        moveZerosSwap(arr3);
        printArray(arr3);
    }

    // ---------------------------------------------------------------------
    // ✅ Approach 1 — Simple Method (Using Extra Array)
    // Time: O(n) | Space: O(n)
    // ---------------------------------------------------------------------
    private static void moveZerosSimple(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        // Step 1: Copy all NON-zero elements
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        // Step 2: Remaining positions automatically default to 0
        // because 'result' is initialized with all zeros

        // Copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }

    // ---------------------------------------------------------------------
    // ✅ Approach 2 — OPTIMIZED (Two Pointers, Stable Order)
    // No swapping with last pointer. Best interview solution.
    //
    // Idea:
    // - Keep pointer j for the position where next NON-zero must go.
    // - First pass: Move all non-zeros forward.
    // - Second pass: Fill remaining elements with zeros.
    //
    // Time: O(n) | Space: O(1)
    // ---------------------------------------------------------------------
    private static void moveZerosOptimized(int[] arr) {

        int j = 0; // pointer for placing non-zero elements

        // Move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        // Fill the remainder with zeros
        while (j < arr.length) {
            arr[j++] = 0;
        }
    }

    // ---------------------------------------------------------------------
    // ✅ Approach 3 — Swap Zero with Last Non-zero (Your idea corrected)
    // NOTE: This is NOT stable (order breaks).
    // Time: O(n) | Space: O(1)
    // ---------------------------------------------------------------------
    private static void moveZerosSwap(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // If left element is zero → swap with right
            if (arr[left] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                right--;  // decrease right because we moved zero at end
            } else {
                left++;   // move left forward only if element is non-zero
            }
        }
    }

    /** Utility method to print array */
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
