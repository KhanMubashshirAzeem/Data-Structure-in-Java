package _3_Recursion.Array_Recursion;

public class ReverseArray1Pointer {
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7, 3, 52};
        reverseArray(arr, 0, arr.length);
        printArray(arr);
    }

    private static void reverseArray(int[] arr, int i, int n) {
        if (i >= n / 2)
            return;
        int temp = arr[i];          // 0, 1, 2, 3...
        arr[i] = arr[n - i - 1];    // (6-0-1) = 5 , 4 ,3 ...
        arr[n - i - 1] = temp;      // swap the first with second
        reverseArray(arr, i + 1, n);
    }


    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
