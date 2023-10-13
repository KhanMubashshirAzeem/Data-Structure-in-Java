package Arrays.Array;

public class CheckTwoArrayAreEqualOrNot {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};

        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] mergeArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (arr1[i] == arr2[j]) {
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
