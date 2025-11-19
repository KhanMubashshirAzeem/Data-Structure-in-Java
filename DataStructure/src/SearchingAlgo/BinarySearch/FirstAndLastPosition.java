package SearchingAlgo.BinarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 5, 5, 5, 7, 9};
        first_last_position(arr, 5);
    }

    private static void first_last_position(int[] arr, int target) {
        // Initialize variables for the first occurrence and the last occurrence
        int left = 0, right = arr.length - 1;
        int first = -1;

        // Binary Search for the first occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                // If target found, update the first occurrence and search in the left half
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                // If target is greater, search in the right half
                left = mid + 1;
            } else {
                // If target is smaller, search in the left half
                right = mid - 1;
            }
        }

        // Reset left and right pointers for the second binary search
        left = 0;
        right = arr.length - 1;

        // Binary Search for the last occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                // If target found, update the last occurrence and search in the right half
                left = mid + 1;
            } else if (arr[mid] < target) {
                // If target is greater, search in the right half
                left = mid + 1;
            } else {
                // If target is smaller, search in the left half
                right = mid - 1;
            }
        }

        // Print the first and last occurrences
        System.out.println(first + " " + left);
    }
}
