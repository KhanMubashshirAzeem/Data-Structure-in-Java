package Arrays.Array;

import java.util.Scanner;


public class FindElement {

    static void printArray(int[] arr) {
        System.out.print("Elements in the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println(key + " is present at index " + (i + 1));
                break;
            } else {
                System.out.println(key+" is not present in the Array. ");
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of element you want in array? ");
            int n = sc.nextInt();   // Length
            int[] arr = new int[n];  // Length of Array

            System.out.print("Enter " + n + " elements : ");
            for (int i = 0; i < n; i++)  // Traversing from 0 to n mean till length
            {
                arr[i] = sc.nextInt();  // Storing the element in the array
            }

            printArray(arr);
            System.out.print("Enter key : ");
            int key = sc.nextInt();
            findElement(arr, key);

        }

    }
}




