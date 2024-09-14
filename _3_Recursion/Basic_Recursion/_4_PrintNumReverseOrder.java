package _3_Recursion.Basic_Recursion;

public class _4_PrintNumReverseOrder {
    public static void main(String[] args) {
        int n = 5;
        callMethod1(n, n);
    }

    private static void callMethod1(int i, int n) {
        if (i < 1) return;

        System.out.println(i);
        callMethod1(i - 1, n);


    }
}
