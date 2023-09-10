package SearchingAlgo;

import java.util.Scanner;

public class BinarySearch {

    public static void display(int arr[], int n)
    {
        System.out.print("The Element in the Array are : ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void searchElement(int arr[], int n, int key) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println(key + " is present at index " + (mid+1));
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(key + " is not present in the array.");
    }


    public static void main(String[] args) {

        System.out.println("Enter numbers of element you want in Array? : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" elements :");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        display(arr , n );

        System.out.println("Enter the element you want to search");
        int key = sc.nextInt();
        searchElement(arr, n, key);

    }
}
