package _3_Basic_Recursion;

public class _2_PrintName5Times {
    public static void main(String[] args) {
        int i = 1, n = 4;
        callFunction(i, n);
    }

    private static void callFunction(int i, int n) {
        if (i > n)
            return;
        System.out.println("Khan Mubashshir");
        callFunction(i+1, n);

    }
}
