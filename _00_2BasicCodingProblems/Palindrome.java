package _00_2BasicCodingProblems;

public class Palindrome {
    public static void main(String[] args) {
        int num = 34343;  // Number to check
        checkPalindrome(num);  // Call the method to check if it's a palindrome
    }

    private static boolean checkPalindrome(int num) {
        final int finalNum = num; // Store the original number for comparison later
        int revNum = 0;           // This will store the reversed number

        // Loop to reverse the number
        while (num > 0) {
            int lastDigit = num % 10;
            // Extract the last digit of the number (e.g., 34343 % 10 = 3)

            revNum = (revNum * 10) + lastDigit;
            // Shift digits left in revNum and add the new digit
            // For example: if revNum is 34 and lastDigit is 3, new revNum = 343

            num = num / 10;
            // Remove the last digit from the original number
            // For example: if num was 34343, now num = 3434
        }

        // After the loop, we compare the reversed number with the original
        if (finalNum == revNum) {
            System.out.println("Its palindrome");
            return true;
        } else {
            System.out.println("Its not a palindrome");
            return false;
        }
    }
}
