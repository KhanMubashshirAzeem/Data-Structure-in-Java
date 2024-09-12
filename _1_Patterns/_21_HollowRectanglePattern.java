package _1_Patterns;

public class _21_HollowRectanglePattern {
    public static void main(String[] args) {
        int n = 4;
        printHollow(n);
    }

    private static void printHollow(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.printf("* ");
                } else System.out.printf("  ");
            }
            System.out.println();
        }
    }
}
