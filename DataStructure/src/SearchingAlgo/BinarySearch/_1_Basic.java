package SearchingAlgo.BinarySearch;

import java.util.Scanner;

public class _1_Basic {
    public static int search(int[] nums, int target) {
        // Write your code here.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;  // Return the index if target is found
            }
        }
        return -1;  // Return -1 if the target is not found
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];  // Length of Array
        for (int i = 0; i < n; i++)  // Traversing from 0 to n mean till length
        {
            arr[i] = scanner.nextInt();  // Storing the element in the array
        }
        int t = scanner.nextInt();
        System.out.println(search(arr, t));
    }
}
