package _00_1WonderBiz_DSA_Problem.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int ele = 18;
        int[] arr = {10, 15, 14, 18, 19};
        System.out.println(ele + " found at index " + findEle(arr, ele));
    }

    public static int findEle(int[] arr, int ele) {
        int i;
        for (i = 0; i <= arr.length; i++) {
            if (arr[i] == ele) {
                return i + 1;
            } else return 0;

        }
        return i;
    }
}
