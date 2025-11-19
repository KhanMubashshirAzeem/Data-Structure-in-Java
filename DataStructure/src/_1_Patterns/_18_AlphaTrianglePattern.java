package _1_Patterns;


public class _18_AlphaTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {
        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for printing characters from 'C' (n + 'A' - 1) down to 'A'
            for (char ch = (char) ('A' + n - 1); ch >= 'A' + n - 1 - i; ch--) {
                System.out.print(ch + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

