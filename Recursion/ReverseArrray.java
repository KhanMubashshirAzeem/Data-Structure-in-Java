package Recursion;

import java.util.Scanner;

public class ReverseArrray {
    public static void reverseArray(int[] arr, int low, int high) {
        if (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            reverseArray(arr, low + 1, high - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element you want in an array : ");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.println("Enter " + n + " numbers as data : ");

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;
        reverseArray(data, low, high);

        System.out.print("Reversed array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
