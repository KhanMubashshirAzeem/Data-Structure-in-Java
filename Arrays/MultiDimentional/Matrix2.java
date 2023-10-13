package Arrays.MultiDimentional;

import java.util.Scanner;

public class Matrix2 {

    public static void display(int rows, int columns, int arr[][]) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no of colunms : ");
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];

        System.out.println("\nEnter " + (rows * columns) + " elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element in "+i+","+j+" : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is ");
        //============== Method to Display Multi Array ================================================
        display(rows, columns, arr);


        //============== For user understanding (row-1 and column-1)==================================
        System.out.println("Enter row and column to acces element");
        rows = sc.nextInt();
        columns = sc.nextInt();
        int result = arr[rows-1][columns-1];
        System.out.println("Element at "+rows+","+columns+" is "+result);




    }
}
