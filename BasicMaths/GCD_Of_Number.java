package BasicMaths;

import static java.lang.Math.min;

public class GCD_Of_Number {
    public static void main(String[] args) {
        int num = 12, num2 = 10;
        findGCD(num, num2);
    }

    private static void findGCD(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
