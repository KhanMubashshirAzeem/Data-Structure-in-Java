package ArraysAndHashing;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int target = 7;

        TwoSum obj = new TwoSum();
        int[] result = obj.twoSumBruteForce(arr, target);

        for (int index : result) {
            System.out.print(index + " ");
        }


    }



    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
