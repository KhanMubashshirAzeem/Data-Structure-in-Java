package _6_Sorting.BubbleSort;

import java.util.Scanner;

public class BubbleSort {
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

        bubbleSort(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        System.out.println("Sorted Array using Bubble Sort : ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

}
