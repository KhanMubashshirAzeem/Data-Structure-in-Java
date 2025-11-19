package _1_Patterns;

public class _22_TheNumberPattern {
    public static void main(String[] args) {
        int n = 4;
        printHollow(n);
    }

    private static void printHollow(int n) {
        int nm1 = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.printf(n + " ");
                } else System.out.printf(nm1+" ");
            }
            nm1 = nm1 - 1;
            System.out.println();
        }
    }
}
