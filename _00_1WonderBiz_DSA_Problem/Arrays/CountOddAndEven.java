package _00_1WonderBiz_DSA_Problem.Arrays;

public class CountOddAndEven {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};

        int oddCount = 0;
        int evenCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
