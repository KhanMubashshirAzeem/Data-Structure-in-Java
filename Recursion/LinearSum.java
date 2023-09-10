package Recursion;

import java.util.Scanner;

public class LinearSum {
    public static int linearSum(int[] data , int n)
    {
        if (n==0)
        {
            return 0;
        }
        else
            return linearSum(data , n-1) + data[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element you want in an array : ");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.println("Enter "+n+ " numbers as data : ");

        for (int i=0; i<n ; i++)
        {
            data[i] = sc.nextInt();
        }

        int result = linearSum(data , n);
        System.out.println("The linear sum is "+result);
    }
}
