package Arrays.Array;

public class Reverse {
    static void reverseArray(int start, int end, String[] arr) {
        String temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr = {"first", "second", "third", "fourth"};

        System.out.println("Array before swapping : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(" ");

//        String temp = arr[1];
//        arr[1] = arr[2];
//        arr[2] = temp;

        int start = 0;
        int end = arr.length - 1;
        reverseArray(start, end, arr);
        printArray(arr);


    }
}
