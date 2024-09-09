package _3_Basic_Recursion;

public class _3_PrintNumNTimes {
    public static void main(String[] args) {
        int i = 1, n = 5;
        callMethod(i, n);
    }

    private static void callMethod(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        callMethod(i + 1, n);
    }
}
