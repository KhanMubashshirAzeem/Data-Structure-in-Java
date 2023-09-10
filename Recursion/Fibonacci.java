package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibbo(int n)
    {
        if (n<=1)
            return n;
        else
            return fibbo(n-1) + fibbo(n-2);
    }
    public static void main(String[] args) {
//        while ()
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter number to find Fibonacci series : ");
//
//            int n = sc.nextInt();
//            System.out.println(ans);

            for (int i=0 ; i<=30 ; i++)
            {
               if (i<=10)
               {
                   System.out.print("  "+fibbo(i));
               }
            }

//        }
    }
}
