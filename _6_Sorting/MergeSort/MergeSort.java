package _6_Sorting.MergeSort;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 4, 5, 1};
        System.out.print("Array before sorting : ");
        printArray(arr);

        int l = 0;
        int r = arr.length - 1;
        mergeSort(arr, l, r);
        System.out.print("Array after sorting : ");
        printArray(arr);

    }

    public static void printArray(int[] arr) {  // To print the array
        for (int j : arr) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;                 // base case if left and right cross each other
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);             // Dividing and sorting left array till single element
        mergeSort(arr, mid + 1, r);      // Dividing and sorting right array till single element
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;           // n1 is length of left array
        int n2 = r - mid;               // n2 is length of right array
        int[] left = new int[n1];       // Initialization of left array
        int[] right = new int[n2];      // Initialization of right array
        int i, j, k;

        for (i = 0; i < n1; i++)
            left[i] = arr[l + i];          //Storing element of left array
        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];   //Storing element of right array

        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {          // Traversing for left to mid and from mid to right
            if (left[i] < right[j])         // If element from left is less than element form right of the same index then store left in temp
                arr[k++] = left[i++];
            else                            // otherwise store element of right arr in temp arr
                arr[k++] = right[j++];
        }

        // both the array left and right are traversing same at same index in their own array.
        // But there may be chance that element of any one array will be remaining because length of both array
        // may not always be same.
        while (i < n1)              // Storing the remaining left array element in temp array
            arr[k++] = left[i++];
        while (j < n2)              // Storing the remaining right array element in temp array
            arr[k++] = right[j++];

    }

}
