package _2_BasicMaths;

import static java.lang.Math.min;

public class GCD_Of_Number {
    public static void main(String[] args) {
        int num = 12, num2 = 10;
        method1(num, num2);

        method2(num,num2);
    }



    private static void method1(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= min(n1, n2); i++) {        // From 1 to the smallest number
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }


    private static void method2(int num, int num2) {
        int gcd = 0;
        for (int i = min(num,num2);i>=1;i--){               // Form the small number till 1
            if (num % i == 0 && num2 % i == 0) {
                gcd = i;
                break;                                      // As soon as we get the divisor we will break the loop
                                                            // because we are traversing the large number to small
            }
        }
        System.out.println(gcd);
    }

}
