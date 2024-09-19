package String;

public class ReverseString {
    public static String reverseString(String str) {
        // Trim the input string to remove leading/trailing spaces
        str = str.trim();

        // Split the string by spaces to get individual words
        String[] words = str.split("\\s+");

        // Use StringBuilder to efficiently build the result
        StringBuilder reversedString = new StringBuilder();

        // Reverse the words and append them to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);

            // Add a space between words, but not after the last word
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        // Return the reversed string
        return reversedString.toString();
    }
}
