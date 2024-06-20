package SearchingAlgo.BinarySearch;

import java.util.Scanner;
public class SearchInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Example 2D matrix (sorted row-wise and column-wise)
        int[][] arr = {{1, 4, 6, 8, 10},
                {2, 7, 9, 12, 15},
                {3, 11, 20, 22, 24},
                {5, 16, 25, 30, 40}};
        // Get the target number from the user
        System.out.println("Enter the number you want to search:");
        int target = sc.nextInt();
        // Call the searchInMatrix function and print the result
        System.out.println(searchInMatrix(arr, target));
    }
    // Function to search for the target number in the sorted matrix
    public static boolean searchInMatrix(int[][] arr, int target) {
        // Start from the top-right corner of the matrix
        int i = 0, j = arr[0].length - 1;
        // Perform search until either the target is found or the indices go out of bounds
        while (i < arr.length && j >= 0) {
            // If the current element is equal to the target, return true
            if (arr[i][j] == target) {
                return true;
            } else if (arr[i][j] < target) {
                // If the current element is less than the target, move to the next row
                i++;
            } else {
                // If the current element is greater than the target, move to the previous column
                j--;
            }
        }
        // If the loop exits, the target is not found in the matrix
        return false;
    }
}
