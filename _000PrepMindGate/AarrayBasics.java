package _000PrepMindGate;

/**
 * This class demonstrates basic operations on arrays in Java.
 * It includes examples of 1D and 2D array initialization,
 * as well as utility methods for inserting, deleting, finding
 * max/min, and reversing elements in arrays.
 */
public class AarrayBasics {

    // 1D Array Declarations and Initializations
    int[] arr1 = new int[5];                    // Creates an empty array of size 5
    int[] arr2 = {1, 2, 3, 4, 5};               // Direct initialization with values
    int[] arr3 = new int[] {10, 20, 30};        // Alternative way of initializing

    // 2D Arrays (Matrix)
    int[][] matrix = new int[3][4];             // 3 rows and 4 columns (empty matrix)
    int[][] grid = {{1, 2}, {3, 4}, {5, 6}};     // Directly initialized 2D array

    public static void main(String[] args) {
        // Main method can be used to test the utility methods.
    }

    /**
     * Inserts an element at a specific position in the array.
     *
     * @param arr      The original array.
     * @param element  The element to insert.
     * @param position The position where the element should be inserted.
     * @return A new array with the element inserted.
     */
    public static int[] insertElement(int[] arr, int element, int position) {
        int[] newArr = new int[arr.length + 1];

        // Copy elements before the insert position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = element;

        // Copy remaining elements
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    /**
     * Deletes an element from a specific position in the array.
     *
     * @param arr      The original array.
     * @param position The index of the element to be deleted.
     * @return A new array with the element removed.
     */
    public static int[] deleteElement(int[] arr, int position) {
        if (position < 0 || position >= arr.length) {
            return arr; // Invalid position, return original array
        }

        int[] newArr = new int[arr.length - 1];

        // Copy elements before the deletion point
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Copy elements after the deletion point
        for (int i = position + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    /**
     * Finds the maximum value in the array.
     *
     * @param arr The array to search.
     * @return The maximum value found. If the array is empty, returns Integer.MIN_VALUE.
     */
    public static int findMax(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Finds the minimum value in the array.
     *
     * @param arr The array to search.
     * @return The minimum value found. If the array is empty, returns Integer.MAX_VALUE.
     */
    public static int findMin(int[] arr) {
        if (arr.length == 0) return Integer.MAX_VALUE;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Reverses the elements of the array in-place.
     *
     * @param arr The array to be reversed.
     */

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
