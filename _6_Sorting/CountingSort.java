package _6_Sorting;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr= {8,9,1,7,6,3,1,3};
        countingSort(arr);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }

    public static void countingSort(int[] arr) {
        // Step 1: Find the largest element in the input array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Create a count array to store the frequency of each element
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // Increment the count for the current element in the input array
        }

        // Step 3: Reconstruct the sorted array from the count array
        int j = 0; // Index for traversing the input array 'arr'
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i; // Place the current element in the sorted order
                j++; // Move to the next index in the input array 'arr'
                count[i]--; // Decrease the count for the current element
            }
        }

        // Step 4: Print the sorted array
        printArray(arr);
    }

}
