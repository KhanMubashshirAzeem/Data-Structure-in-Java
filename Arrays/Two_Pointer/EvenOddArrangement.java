package Array.Two_Pointer;

import java.util.Scanner;

public class EvenOddArrangement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        int n = sc.nextInt();   // Length
        int[] arr = new int[n];  // Length of Array

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Storing the element in the array
        }
        sortArrayByParity(arr);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.print("Elements in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left]% 2 == 1 && arr[right]% 2 == 0) {
//                swap(arr, left, right);
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left]% 2 == 0) {
                left++;
            }
            if (arr[right]% 2 == 1) {
                right--;
            }
        }
    }
}
