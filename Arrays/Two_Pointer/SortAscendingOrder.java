package Arrays.Two_Pointer;

import java.util.Scanner;

public class SortAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in the array? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);
    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }


    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {            // From 1st element to last element
            for (int j = i + 1; j < n; j++) {     // From 2nd element to last element
                if (arr[i] > arr[j]) {      //swap elements if not in order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array is: ");
        printArray(arr, 0);
    }

}
