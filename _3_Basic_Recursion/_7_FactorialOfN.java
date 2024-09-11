package _3_Basic_Recursion;

public class _7_FactorialOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
    }

    private static int printFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * printFactorial(n - 1);
    }
}
