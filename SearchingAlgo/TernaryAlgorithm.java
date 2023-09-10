package SearchingAlgo;

import java.util.Scanner;

public class TernaryAlgorithm {

    public static void display(int arr[], int n) {
        System.out.print("The Element in the Array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void searchElement(int arr[], int n, int key) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (key == arr[mid1])
            {
                System.out.println(key+ " found at index "+(mid1+1));
                return;
            }
            if (key == arr[mid2])
            {
                System.out.println(key+" found at index "+(mid2+1));
                return;
            }
            if (key<arr[mid1])
            {
                high = mid1-1;
            }
            else if (key > arr[mid2]) {
                low = mid2+1;
            }
            else {
                low = mid1+1;
                high = mid2-1;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers of element you want in Array? : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr, n);
        System.out.print("Enter element which you want to search : ");
        int key = sc.nextInt();
        searchElement(arr , n , key);

    }
}
