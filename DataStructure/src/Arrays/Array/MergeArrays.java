package Arrays.Array;

public class MergeArrays {
    public static void main(String[] args) {

        // Initialize two arrays.
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        // Calculate the length of the arrays.
        int array1Length = array1.length;
        int array2Length = array2.length;

        // Create a new array to store the merged arrays.
        int[] mergedArray = new int[array1Length + array2Length];

        // Iterate through the arrays and copy the elements to the merged array.
        // The `i` loop iterates through the `array1` array.
        for (int i = 0; i < array1Length; i++) {
            // The `mergedArray` array is copied at index `i` with the element at index `i` of the `array1` array.
            mergedArray[i] = array1[i];
        }

        // The `j` loop iterates through the `array2` array.
        for (int j = 0; j < array2Length; j++) {
            // The `mergedArray` array is copied at index `i + j` with the element at index `j` of the `array2` array.
            mergedArray[array1Length + j] = array2[j];
        }

        System.out.println("Result after merging both Array ");
        printArray(mergedArray,0);
//        //System.out.println(Arrays.toString(mergedArray));
    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length){
            return;
        }
        System.out.println(arr[index]+" ");
        printArray(arr, index+1);
    }

}
