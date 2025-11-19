package Arrays.Array;

public class CheckTwoArrayAreEqualOrNot {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        int length1 = arr1.length;
        int length2 = arr2.length;

        for (int i = 0; i < length1; i++) {             // Traversing the 1st Array
            for (int j = 0; j < length2; j++) {         // Traversing the 2nd Array
                if (arr1[i] == arr2[j]) {               // Comparing the elements of both Array with each other
                    System.out.println("Both Array are Equal");
                    return;
                } else {
                    System.out.println("Both array are not equal");
                    return;
                }
            }
        }

    }
}
