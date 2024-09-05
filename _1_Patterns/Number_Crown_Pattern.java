package _1_Patterns;

public class Number_Crown_Pattern {
    public static void main(String[] args) {
        int n = 4;
        printStar(n);
        System.out.println();
        printNumber(n);
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

    private static void printNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= ((2 * n) - (i * 2)); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {      // To print the number we have to reverse the loop here.
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
