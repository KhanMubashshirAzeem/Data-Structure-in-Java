package _7_String.PracticeQuestions;

public class CountLowerCaseVowels {
    public static void main(String[] args) {
        String str = "Mubashshir";

        System.out.println("The total length of str is " + str.length());
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // Get the character at position i
            // Check if the character is lowercase and a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of lowercase vowels: " + count);
    }
}
