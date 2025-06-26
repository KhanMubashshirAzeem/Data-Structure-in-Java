package _001WonderBiz_DSA_Problem;

public class Compression {
    public static void main(String[] args) {
        String str = "aaabbbbcc"; // Input string to be compressed
        System.out.println(compress(str)); // Output: a3b4c2
    }

    // Method to compress the string
    public static String compress(String str) {
        String newStr = ""; // This will store the compressed result

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // Start count from 1 for current character

            // Count how many times the current character repeats consecutively
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;  // Increment count
                i++;      // Move to next character
            }

            newStr += str.charAt(i); // Add the character to result

            if (count > 1) {
                newStr += count.toString(); // If repeated, add the count (e.g., "a3")
            }
        }

        return newStr; // Return the final compressed string
    }
}
