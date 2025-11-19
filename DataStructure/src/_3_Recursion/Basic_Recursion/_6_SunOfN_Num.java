package _3_Recursion.Basic_Recursion;


public class _6_SunOfN_Num {
    public static void main(String[] args) {
        int n = 7;

        // Parameterised Recursion
        method(n, 0);
        System.out.println();

        // Functional recursion
        method2(n);
        System.out.println(method2(n));

        // GFG problem
        System.out.println("GFG Problem \n"+sumOfSeries(n));
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

    // This problem is from GFG
    static long sumOfSeries(long n) {
        // code here  // Base case: when n reaches 0
        if (n == 0) {
            return 0;
        }

        // Recursive case: cube of n + sum of cubes of numbers from 1 to (n-1)
        return (n * n * n) + sumOfSeries(n - 1);

    }

}
