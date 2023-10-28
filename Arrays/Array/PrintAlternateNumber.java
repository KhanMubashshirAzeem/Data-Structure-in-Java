package Arrays.Array;

public class PrintAlternateNumber {
    public static void main(String[] args) {
        int[] arr = {12, 16, 1, 8, 1, 32, 56, 4, 6, 8, 964, 6, 4, 8546, 84, 864, 968};
        System.out.println("The original array ");
        printArray(arr);
        System.out.println("The Alternate array ");
        printAlternate(arr);
    }

    public static void printArray(int[] arr){
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printAlternate(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
