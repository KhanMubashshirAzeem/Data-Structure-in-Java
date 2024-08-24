package Patterns;

public class Right_Angled_Triangle {
    static void method(int n) {
        int i, j;
        // This is the outer loop which will loop for the rows.
        for (i = 0; i < n; i++) {
            // This is the inner loop which loops for the columns
            // no. of columns = row number for each line here.
            for (j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            // As soon as stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        method(n);
    }
}
