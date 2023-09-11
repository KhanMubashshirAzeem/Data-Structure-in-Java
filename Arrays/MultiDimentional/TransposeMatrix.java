package Array.MultiDimentional;

import java.util.Scanner;

public class TransposeMatrix {

    static void printMatrix(int rows, int columns, int[][] arr) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int r , int c , int[][] matrix)
    {
        int[][]  tranM = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                tranM[i][j] = matrix[j][i];
                System.out.print(tranM[i][j] +" ");
            }
            System.out.println();
        }

    }

    //========== Transpose Matrix using temp (It works only on square matrix)===========================
    static void transposeInplace(int[][] matrix, int r, int c)
    {
//        int[][]  tranM = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transpose matrix using temp is : ");
        printMatrix(c, r, matrix);
    }


    public static void main(String[] args) {

       while (true)
       {

           Scanner sc = new Scanner(System.in);

           System.out.print("\n\nEnter rows : ");
           int rows = sc.nextInt();
           System.out.print("Enter columns : ");
           int columns = sc.nextInt();

           int[][] matrix = new int[rows][columns];

           System.out.println("Enter " + rows * columns + " elements :");
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                   matrix[i][j] = sc.nextInt();
               }
           }

           System.out.println("Matrix is : ");
           printMatrix(rows, columns, matrix);

           System.out.println("Transpose matrix is : ");
           transposeMatrix(rows, columns, matrix);

           try {
               transposeInplace(matrix, rows, columns);
           }catch (Exception exception)
           {
               System.out.println("\nError!!!!!!!!! Note : transposeInplace works only on square matrix : ");
           }




       }

    }
}
