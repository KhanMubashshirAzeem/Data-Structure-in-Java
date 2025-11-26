package ArraysAndHashing.two_sum;

public class BruteForce {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int target = 7;

        BruteForce obj = new BruteForce();

        // Call brute force method
        int[] result = obj.twoSumBruteForce(arr, target);

        // Print brute force result
        for (int index : result) {
            System.out.print(index + " ");
        }
        System.out.println();

    }


    /**
     * Brute force approach: check all pairs (O(n^2))
     */
    public int[] twoSumBruteForce(int[] nums, int target) {

        // Check every pair i < j
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the matching pair
                }
            }
        }

        return new int[0]; // If no pair found
    }


}
