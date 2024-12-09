package BackTracking;  // Package declaration (used to organize code)

public class FindSubsets {

    // Method to find subsets of a string using backtracking
    public static void findSubsets(String str, String ans, int i) {
        // Base case: if 'i' reaches the length of the string, we have processed all characters
        if (i == str.length()) {
            // If 'ans' is empty, it means we are at the empty subset, so print "null"
            if (ans.isEmpty()) {
                System.out.println("null");
            } else {
                // Otherwise, print the subset (stored in 'ans')
                System.out.println(ans);
            }
            return;  // Stop further recursion once we hit the base case
        }

        // Recursion: Try two possibilities for the current character in the string

        // Yes Choice: Include the character at the current index in the subset
        // Add the current character (str.charAt(i)) to the answer string and recurse for the next character
        findSubsets(str, ans + str.charAt(i), i + 1);

        // No Choice: Do not include the character at the current index in the subset
        // Just recurse to the next character without adding anything to the answer string
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        // The string whose subsets we want to find
        String str = "abc";

        // Calling the recursive method with an empty string for the answer and starting at index 0
        findSubsets(str, "", 0);
    }
}


