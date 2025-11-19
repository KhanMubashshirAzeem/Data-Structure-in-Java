package _00_1WonderBiz_DSA_Problem.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 15, 14, 18, 19};
        System.out.println(search(arr));
    }

    public static int search(int[] arr) {
        int st = 0, en = arr.length, key = 18;
        while (st <= en) {
            int mid = (st + en) / 2;
            if (arr[mid] == key) { // Found
                return key;
            }
            if (arr[mid] < key) { // Go right
                st = mid++;
            } else { // Go left
                mid--;
            }
        }
        return -1;
    }
}

