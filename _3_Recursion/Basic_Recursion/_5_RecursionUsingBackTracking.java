package _3_Recursion.Basic_Recursion;

public class _5_RecursionUsingBackTracking {
    public static void main(String[] args) {
        int n = 5;
        callMethod1(n, n);
    }

    private static void callMethod1(int i, int n) {
        if (i < 1) return;

        callMethod1(i - 1, n);
        System.out.println(i);
    }


}
