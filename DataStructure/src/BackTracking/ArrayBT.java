package BackTracking;

public class ArrayBT {
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }

    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); //fnx call step
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i]);
        }
        System.out.println(" ");
    }

}
