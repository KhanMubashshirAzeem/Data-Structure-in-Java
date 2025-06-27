package _00_1WonderBiz_DSA_Problem.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 15, 14, 18, 19};
        int lNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (lNum < arr[i]) {
                lNum = arr[i];
            }
        }
        System.out.println(lNum + " is the largest number in the array");
    }
}
