package Arrays.Two_Pointer;

import java.util.Scanner;

public class Sort0sAnd1s {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        int n = sc.nextInt();   // Length
        int[] arr = new int[n];  // Length of Array

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Storing the element in the array
        }

        printArray(arr);
        sort0sAnd1s(arr);


    }

    public static void printArray(int[] arr)
    {
        System.out.print("Elements in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort0sAnd1s(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for (int i=0; i<n; i++)
        {
            if (arr[i]==0)
            {
                zeros++;
            }
        }
        //0 to zeroes-1: 0, zeroes to n-1 : 1
        for(int i = 0; i < n; i++){
            if(i < zeros){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        printArray(arr);

    }

}











