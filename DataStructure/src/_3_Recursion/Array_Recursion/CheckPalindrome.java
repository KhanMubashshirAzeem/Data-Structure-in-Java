package _3_Recursion.Array_Recursion;

import java.io.*;
import java.util.Arrays;

public class CheckPalindrome {

    public static void main(String[] args) {
        String str = "ABCDCBA";  // Example string to check for palindrome

        // Call the isPalindrome method to check if the string is a palindrome
        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println("Yes it's Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static private boolean isPalindrome(String s) {
        // Initialize two pointers: left and right
        int left = 0, right = s.length() - 1;

        // Loop as long as left pointer is less than right pointer
        while (left < right) {
            char leftChar = s.charAt(left);  // Get the character at left index
            char rightChar = s.charAt(right); // Get the character at right index

            // Skip non-alphanumeric characters on the left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters on the right
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // Compare characters after converting them to lowercase
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false; // Not a palindrome if characters don't match
            }

            // Both characters match, move pointers closer
            left++;
            right--;
        }

        // If the loop completes without returning false, it's a palindrome
        return true;
    }
}