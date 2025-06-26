package _001WonderBiz_DSA_Problem;

// StringBuilder is similar to String but it's mutable (can be modified without creating a new object)
public class StringBuilderClass {
    public static void main(String[] args) {

        // Create an empty StringBuilder
        StringBuilder strB = new StringBuilder("");

        // Append all characters from 'a' to 'z' with space in between
        for (char ch = 'a'; ch <= 'z'; ch++) {
            strB.append(ch + " "); // Appends each letter followed by a space
        }

        // Print the final StringBuilder content (which will be "a b c d ... z ")
        System.out.println(strB);

        // Sample input string
        String str = "hi, i am khan";

        // Call the method to capitalize the first letter of every word
        System.out.println(toUpperCase(str));
    }

    // Method to convert the first letter of every word to uppercase
    public static String toUpperCase(String str) {

        // Create a new StringBuilder to build the result
        StringBuilder stringBuilder = new StringBuilder("");

        // Capitalize the first character of the string and add it
        char ch = Character.toUpperCase(str.charAt(0));
        stringBuilder.append(ch);

        // Loop through the rest of the characters
        for (int i = 1; i < str.length(); i++) {

            // If current character is space and it's not the last character
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                stringBuilder.append(str.charAt(i)); // Append the space

                i++; // Move to the next character after space

                // Capitalize the next character and append it
                stringBuilder.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // If it's not a space, just append the character as it is
                stringBuilder.append(str.charAt(i));
            }
        }

        // Return the final formatted string
        return stringBuilder.toString();
    }
}
