package Arrays.Array;

/*
The question is to rotate the matrix by 90 degree clockwise
    So we solve this problem by
        1. Take Transpose of N*N matrix
        2. Swap element of column
    in real world

 */
public class rotate90D {
    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1, 7},
                            {9, 11, 5, 4},
                            {6, 0, 13, 17},
                            {7, 21, 14, 15}};
        rotateBy90(matrix);
        print2DArray(matrix);
    }

    public static void print2DArray(int[][] matrix) {
        for (int[] a:matrix) {
            for (int val: a) {
                System.out.printf(val+" ");
            }
            System.out.println();
        }
    }

    // Function to rotate a matrix by 90 degrees clockwise
    public static void rotateBy90(int[][] arr) {
        int n = arr.length; // Get the size of the matrix (assuming it's a square matrix)

        // Step 1: Take the transpose of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap arr[i][j] and arr[j][i] to get the transpose
                int temp = arr[i][j]; // Store the value at arr[i][j] in a temporary variable
                arr[i][j] = arr[j][i]; // Replace arr[i][j] with the value at arr[j][i]
                arr[j][i] = temp; // Replace arr[j][i] with the stored value
            }
        }

        // Step 2: Swap the columns to complete the rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Swap arr[i][j] and arr[i][n - 1 - j] to rotate the column
                int temp = arr[i][j]; // Store the value at arr[i][j] in a temporary variable
                arr[i][j] = arr[i][n - 1 - j]; // Replace arr[i][j] with the value at arr[i][n - 1 - j]
                arr[i][n - 1 - j] = temp; // Replace arr[i][n - 1 - j] with the stored value
            }
        }
    }



}
