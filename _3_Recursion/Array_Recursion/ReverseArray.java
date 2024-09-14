package _3_Recursion.Array_Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7, 3};
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap the elements at the start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the remaining sub-arrays
        reverseArray(arr, start + 1, end - 1);
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}