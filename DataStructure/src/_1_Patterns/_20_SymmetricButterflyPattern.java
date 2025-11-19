package _1_Patterns;

public class _20_SymmetricButterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        printStar1(n);
        printStar(n);
    }

    private static void printStar1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < (2 * n) - (2 * i); j++) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }

    private static void printStar(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (2 * i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


}
