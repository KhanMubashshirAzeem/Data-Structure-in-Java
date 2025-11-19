package Arrays.Array;

public class MissingNumber {
    public static void main(String[] args) {

        int n = 10; // Define the range from 0 to 10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array of integers

        // Create a boolean array to mark the presence of elements in the range
        boolean[] present = new boolean[n + 1];

        // Mark elements in the array as present
        for (int num : arr) {
            // Ensure the number is within the range [0, n]
            if (num >= 0 && num <= n) {
                present[num] = true; // Mark the element as present in the boolean array
            }
        }

        System.out.println("The missing elements are:");
        for (int i = 0; i <= n; i++) {
            // Check if the element is not marked as present in the boolean array
            if (!present[i]) {
                System.out.println(i); // If not present, it's a missing element
            }
        }


    }

}
