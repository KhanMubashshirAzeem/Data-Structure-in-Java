package Recursion;

import java.util.Scanner;

public class printNaturalNumber {
    static void printIncreasing(int n)
    {
        if (n==1)
        {
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        while (true)
        {
            System.out.print("Please enter positive number : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printIncreasing(n);
        }
    }
}
