package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element you want in array? ");
        int n = sc.nextInt();   // Length
        int[] arr = new int[n];  // Length of Array

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++)  // Traversing from 0 to n mean till length
        {
            arr[i] = sc.nextInt();  // Storing the element in the array
        }

        increasingSort(arr);
        decreasingSort(arr);


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
    }

    public static void increasingSort(int[] arr) {
        System.out.print("Sorted Array using Selection Sort in increasing order : ");
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minPos = i;         // Initially it is new  min element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;     // After founding new min element minPos will update
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[minPos];  //
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void decreasingSort(int[] arr) {
        System.out.print("Sorted Array using Selection Sort in decreasing order : ");
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minPos = i;         // Initially it is new  min element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minPos]) {
                    minPos = j;     // After founding new min element minPos will update
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[minPos];  //
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }


}