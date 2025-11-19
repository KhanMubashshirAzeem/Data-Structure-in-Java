package Arrays.Array;

public class MajorityEle {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 4, 2, 4, 8,2,2,2, 9, 2, 7, 2, 2};
        System.out.println(findMajorityElement(arr, arr.length));
    }

    static int findMajorityElement(int[] arr, int n) {
        int candidate = arr[0]; // Initialize the candidate as the first element of the array
        int count = 1; // Initialize the count as 1 for the first element

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++; // Increment the count if the current element matches the candidate
            } else {
                count--; // Decrement the count if the current element is different from the candidate
            }

            if (count == 0) {
                candidate = arr[i]; // If count reaches 0, update the candidate to the current element
                count = 1; // Reset the count to 1
            }
        }

        // Verify if the candidate is the majority element by counting its occurrences
        count = 0;
        for (int val : arr) {
            if (val == candidate) {
                count++;
            }
        }

        // Check if the candidate appears more than n/2 times, and return the result
        if (count > n / 2) {
            return candidate; // Candidate is the majority element
        } else {
            return -1; // No majority element found
        }
    }
}
