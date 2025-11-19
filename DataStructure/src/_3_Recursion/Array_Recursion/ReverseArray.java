package _3_Recursion.Array_Recursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Take user elements for the array
        System.out.println(
                "Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap the elements at the start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the remaining sub-arrays
        reverseArray(arr, start + 1, end - 1);
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}