package _7_String;

public class UpperCase {
    public static void main(String[] args) {
        // Input string with lowercase letters
        String name  = "mubashshir azeem khan";

        // Call the toUpperCase method and print the result
        System.out.println(toUpperCase(name));
    }

    // Method to convert the first letter of each word to uppercase
    public static String toUpperCase(String str){
        // Initialize a StringBuilder to build the resulting string
        StringBuilder sb = new StringBuilder("");

        // Capitalize the first character of the string (if it exists)
        char ch = Character.toUpperCase(str.charAt(0));  // Convert first character to uppercase
        sb.append(ch);  // Append the uppercase character to StringBuilder

        // Loop through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // If the current character is a space and it's not the last character, capitalize the next character
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));  // Append the space character
                i++;  // Move to the next character (which will be the start of the next word)
                sb.append(Character.toUpperCase(str.charAt(i)));  // Capitalize the next character and append it
            } else {
                // If it's not a space, simply append the character as is
                sb.append(str.charAt(i));
            }
        }

        // Return the resulting string built by the StringBuilder
        return sb.toString();
    }
}
