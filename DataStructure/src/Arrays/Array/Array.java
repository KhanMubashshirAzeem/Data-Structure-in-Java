package Arrays.Array;

import java.util.Scanner;

public class Array {
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

        System.out.println("Printing Element using recursion :");
        printArray(arr,0);
        System.out.println("Printing Array in reverse order using recursion :");
        reverseArray(arr, arr.length-1);



//        System.out.print("Elements in the array are : ");
//        for (int i=0 ; i<n ; i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//
//        System.out.println("\nArray in reverse order : ");
//        for (int j=n-1 ; j>=0 ; j--) {
//            System.out.print(arr[j]+" ");
//        }

    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index+1);
    }

    public static void reverseArray(int[] arr,int last){
        if (last < 0){
            return;
        }
        System.out.println(arr[last]);
        reverseArray(arr,last-1);
    }

}



