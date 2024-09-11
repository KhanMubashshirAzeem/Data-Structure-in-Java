package _3_Basic_Recursion;


public class _6_SunOfN_Num {
    public static void main(String[] args) {
        int n = 6;

        // Parameterised Recursion
        method(n, 0);
        System.out.println();

        // Functional recursion
        method2(n);
        System.out.println(method2(n));
    }

    // Parameterised Recursion
    private static void method(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        method(i - 1, sum + i);
    }

    // Functional recursion
    private static int method2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + method2(n - 1);
    }

}
