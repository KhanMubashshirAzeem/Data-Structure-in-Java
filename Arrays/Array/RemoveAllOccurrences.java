package Arrays.Array;

import java.util.Scanner;

public class RemoveAllOccurrences {
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
        System.out.println("Enter key ");
        int key = sc.nextInt();

//        removeOccurrence(arr,key);
        removeOccurrence(arr, key, 0);

    }


//      // Using Iteration
//    static void removeOccurrence(int[] arr,int key){
//        for (int i=0;i< arr.length;i++){
//            if (arr[i] != key){
//                System.out.print(arr[i]+" ");
//            }
//        }
//    }

    //    // Using recursion
    static void removeOccurrence(int[] arr, int key, int first) {
        if (first == arr.length) {
            return;
        }
        if (arr[first] != key) {
            System.out.print(arr[first] + " ");
        }
        removeOccurrence(arr, key, first + 1);
    }

}
