package _1_Patterns;

public class _15_ReverseLetterTrianglePattern {
    public static void main(String[] args) {
        int n = 3;
        printAlphabets(n);
    }

    private static void printAlphabets(int n) {
        // Outer loop for the number of rows.
        for (int i = n-1; i >= 0; i--) {

            // Inner loop will loop for i times and
            // print alphabets from A to A + i.
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }

    }
}
