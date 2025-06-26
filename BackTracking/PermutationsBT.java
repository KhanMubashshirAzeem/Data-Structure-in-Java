package BackTracking;

public class PermutationsBT {

    // Method to find all permutations of the string 'str'
    public static void findPermutation(String str, String ans) {
        // Base case: If the input string 'str' is empty, it means we have formed a complete permutation
        if (str.isEmpty()) {
            System.out.println(ans);  // Print the current permutation stored in 'ans'
            return;  // Exit the recursion
        }

        // Recursive case: Try each character in 'str' and generate the remaining string by excluding the current character
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);  // Get the current character to append to the answer
            // Generate a new string without the character 'curr' at index 'i'
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // Recursively call the method with the new string and append 'curr' to the answer
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";  // Input string
        findPermutation(str, "");  // Call the method with the input string and an empty answer string
    }

}
