package _3_Recursion;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int gcd(int a , int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (i=i ; i>1 ;i--)
        {
            if (a%i == 0 && b%i == 0)
            {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two number : ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(gcd(a,b));
        }

    }
}
