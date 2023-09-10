import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in the array? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicate(arr);

    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    static void removeDuplicate(int[] arr) {
        int n = arr.length-1;
        System.out.print("\nAfter removing the duplicate element : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[n]);
    }

}
