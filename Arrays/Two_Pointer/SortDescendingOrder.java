package Array.Two_Pointer;

import java.util.Scanner;

public class SortDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int sizeArray = sc.nextInt();
        System.out.println("Enter " + sizeArray + " Elements : ");
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = sc.nextInt();
        }

        sortDescending(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+" ");
        }
        System.out.println();
    }

    public static void sortDescending(int[] array){
        for (int i=0; i< array.length; i++){
            for (int j=i+1; j< array.length; j++){
                if (array[j] > array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Printing Array in Descending Order");
        printArray(array);
    }




}
