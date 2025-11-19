package _1_Patterns;

public class RectangularStarPattern {
    public static void main(String[] args) {
        int i, j, n = 4;
        // This is the outer loop which will loop for the rows.
        for (i = 0; i <= n; i++) {
            // This is the inner loop which will loop for the column.
            for (j = 0; j <= n; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
