package _1_Patterns;

public class RightAngledNumberPyramid {
    static void method(int n) {
        int i, j;
        // This is the outer loop which will loop for the rows.
        for (i = 1; i <= n; i++) {
            // This is the inner loop which loops for the columns
            // no. of columns = row number for each line here.
            for (j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            // As soon as stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        method(n);
    }
}
