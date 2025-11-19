package _3_Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n)
    {
        if (n<10)
        {
            return n;
        }
        else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }



    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 2 digits number to find its sum : ");

            int n = sc.nextInt();
            int ans = sumOfDigits(n);
            System.out.println(ans);

        }
    }
}
