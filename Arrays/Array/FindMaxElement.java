package Arrays.Array;

import java.util.Scanner;

public class FindMaxElement {
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
        System.out.println("Largest element in the array is :"+findMaxElement(arr));
    }

    static int findMaxElement(int arr[]) {
        int Max = arr[0];

        for (int i=0; i<= arr.length-1; i++)
            if (Max<arr[i])
                Max = arr[i];

        return Max;
    }


}
