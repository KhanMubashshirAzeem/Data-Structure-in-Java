package _3_Recursion;

public class Fibonacci {
    public static int fibbo(int n) {
        if (n <= 1)
            return n;
        else
            return fibbo(n - 1) + fibbo(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i <= 20) {
                System.out.print("  " + fibbo(i));
            }
        }
//        System.out.println(fibbo(10));
    }
}
