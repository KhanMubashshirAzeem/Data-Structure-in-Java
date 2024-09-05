package _2_BasicMaths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        while (true){

            System.out.println("Enter a number to check its prime or not");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println("Yes "+ n +" is a prime number.");
            }
            else
                System.out.println(n+" is not a prime number");
        }

    }
}
