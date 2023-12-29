package SearchingAlgo.BinarySearch;

import java.util.Scanner;

public class LinearSearch {

    public static void display(int arr[], int n)
    {
        System.out.print("The Element in the Array are : ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void searchElement(int arr[], int n, int key)
    {
        for (int i=0; i<n; i++)
        {
            if (key == arr[i])
            {
                System.out.println(key+" is present at index "+(i+1));
                return;
            }
            else {
                System.out.println(key+" is not present in Array");
                return;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers of element you want in Array? : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements :");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        display(arr , n );
        System.out.print("Enter element which you want to search : ");
        int key = sc.nextInt();
        searchElement(arr, n , key);

    }
}
