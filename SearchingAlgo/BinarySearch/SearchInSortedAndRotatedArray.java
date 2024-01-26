package SearchingAlgo.BinarySearch;

import java.util.Scanner;

public class SearchInSortedAndRotatedArray {
    public static void main(String[] args) {
        // Given rotated and sorted array
        int[] arr = {9, 11, 14, 15, 20, 22, 2, 3, 5, 7};

        // Prompt user for the element to be found
        System.out.println("Enter the element which you want to find ? ");
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();

        // Find the index of the minimum element in the rotated array
        int minIdx = findMin(arr);

        // Perform binary search in the appropriate half based on the minimum index
        int ans = binarySearch(arr, 0, minIdx - 1, target);
        if (ans == -1) {
            ans = binarySearch(arr, minIdx, arr.length - 1, target);
        }

        // Print the result
        System.out.println(ans);
    }

    // Binary search in a rotated array
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                // Element found, return its index
                return mid;
            } else if (arr[mid] < target) {
                // If target is greater, search in the right half
                left = mid + 1;
            } else {
                // If target is smaller, search in the left half
                // Correct the update of the 'right' variable
                right = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    // Find the minimum element in the rotated array
    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right]) {
                // If the middle element is less than the rightmost element,
                // the minimum element is in the left half
                // Correct the update of the 'right' variable
                right = mid;
            } else {
                // Otherwise, the minimum element is in the right half
                left = mid + 1;
            }
        }

        // 'left' now points to the index of the minimum element
        return left;
    }
}
