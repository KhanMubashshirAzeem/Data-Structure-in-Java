package SearchingAlgo.BinarySearch;
// This class finds the minimum element in a sorted and rotated array using Binary Search.
// The time complexity is O(log n), and the space complexity is O(1).
public class MinimumInSortedAndRotatedArray {
    public static void main(String[] args) {
        // Example input array: {14, 15, 20, 22, 3, 5, 7, 9, 11}
        // The array is sorted and rotated.
        int[] arr = {14, 15, 20, 22, 3, 5, 7, 9, 11};
        // Call the findMin function to find and print the minimum element.
        System.out.println(findMin(arr));
    }

    // Function to find the minimum element in a sorted and rotated array
    public static int findMin(int[] arr) {
        // Initialize left and right pointers for binary search
        int left = 0, right = arr.length - 1;
        // Perform binary search until the left pointer is less than the right pointer
        while (left < right) {
            // Calculate the middle index
            int mid = (left + right) / 2;
            // Check if the middle element is less than the rightmost element
            if (arr[mid] < arr[right]) {
                // The minimum element is in the left half
                // Update the right pointer to mid
                right = mid;
            } else {
                // The minimum element is in the right half
                // Update the left pointer to mid + 1
                left = mid + 1;
            }
        }
        // The left pointer now points to the index of the minimum element
        // Return the minimum element at that index
        return arr[left];
    }
}
