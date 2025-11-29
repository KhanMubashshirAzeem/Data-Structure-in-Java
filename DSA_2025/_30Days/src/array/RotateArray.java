package array;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {8, 9, 3, 7, 1};

        System.out.println("Original Array:");
        printArray(arr);

        // Clone so original doesn’t change
        int[] cloneArr = arr.clone();

        System.out.println("\n🔹 Optimized Left Rotate by 1:");
        rotateLeftByOne(cloneArr);
        printArray(cloneArr);

        System.out.println("\n🔹 Right Rotate by 1 (extra approach):");
        int[] cloneArr2 = arr.clone();
        rotateRightByOne(cloneArr2);
        printArray(cloneArr2);
    }

    /**
     * ✅ LEFT ROTATE BY 1 (Optimized)
     * Example: [8, 9, 3, 7, 1] → [9, 3, 7, 1, 8]
     *
     * Steps:
     * 1. Store first element (temp)
     * 2. Shift all elements left by 1
     * 3. Put temp at the end
     *
     * TIME: O(n)
     * SPACE: O(1)
     */
    private static void rotateLeftByOne(int[] arr) {
        int temp = arr[0];    // Store first element

        // Shift items left
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        // Place first element at end
        arr[arr.length - 1] = temp;
    }

    /**
     * ✅ RIGHT ROTATE BY 1 (Alternative approach)
     * Example: [8, 9, 3, 7, 1] → [1, 8, 9, 3, 7]
     *
     * Steps:
     * 1. Store last element
     * 2. Shift all items right
     * 3. Place temp at index 0
     */
    private static void rotateRightByOne(int[] arr) {
        int temp = arr[arr.length - 1]; // last element

        // Shift elements right
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = temp;
    }

    /**
     * Utility method to print array
     */
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
