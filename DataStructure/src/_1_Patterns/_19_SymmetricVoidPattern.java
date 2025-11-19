package _1_Patterns;

public class _19_SymmetricVoidPattern {
    public static void main(String[] args) {
        int n = 3;
        printStar1(n);
        printStar(n);
    }

    private static void printStar1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < (2 * i) - 2; j++) {
                System.out.printf(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }

    private static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= ((2 * n) - (i * 2)); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
