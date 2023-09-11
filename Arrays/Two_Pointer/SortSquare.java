package Array.Two_Pointer;

import java.util.Scanner;

public class SortSquare {
    public static void main(String[] args) {
        //10 3 2 1 4 5 20
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        int n = sc.nextInt();   // Length
        int[] arr = new int[n];  // Length of Array

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Storing the element in the array
        }

        int[] ans = sortSquares(arr);
        printArray(ans);
        reverseArray(ans);
        System.out.print("Our shorted square array is : ");
        printArray(ans);

    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void reverseArray(int[] arr) {
        int temp, start = 0, end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
}
