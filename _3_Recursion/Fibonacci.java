package _3_Recursion;

public class Fibonacci {
    public static int fibbo(int n) {
        if (n <= 1)
            return n;
        else
            return fibbo(n - 1) + fibbo(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i <= 20) {
                System.out.print("  " + fibbo(i));
            }
        }
        System.out.println("\n The Fibonacci of 10 is  "+fibbo(10));
    }
}
