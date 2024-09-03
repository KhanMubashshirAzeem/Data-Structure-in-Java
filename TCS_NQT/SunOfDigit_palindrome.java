package TCS_NQT;

public class SunOfDigit_palindrome {

    public static void main(String[] args) {
        int num = 651;  // The number we want to check
        methodSol(num);  // Calling the method to check if the sum of digits is a palindrome
    }

    // This method calculates the sum of digits of the given number and checks if the sum is a palindrome
    private static void methodSol(int num) {
        int sum = 0;  // Variable to store the sum of the digits
        int tempNum = num;  // A temporary variable to hold the original number for processing

        // Loop to calculate the sum of digits
        while (tempNum > 0) {
            int lastDigit = tempNum % 10;  // Get the last digit of the number
            sum += lastDigit;  // Add the last digit to the sum
            tempNum = tempNum / 10;  // Remove the last digit from the number
        }

        // After calculating the sum, check if the sum itself is a palindrome
        if (isPalindrome(sum)) {
            System.out.println(sum + " is a palindrome");  // Print if the sum is a palindrome
        } else {
            System.out.println(sum + " is not a palindrome");  // Print if the sum is not a palindrome
        }
    }

    // This method checks if a given number is a palindrome
    private static boolean isPalindrome(int num) {
        int revNum = 0;  // Variable to store the reversed number
        int tempNum = num;  // A temporary variable to hold the original number for processing

        // Loop to reverse the digits of the number
        while (tempNum > 0) {
            int lastDigit = tempNum % 10;  // Get the last digit of the number
            revNum = (revNum * 10) + lastDigit;  // Add the last digit to the reversed number
            tempNum = tempNum / 10;  // Remove the last digit from the number
        }

        // Check if the original number is equal to its reversed version
        return num == revNum;  // Return true if the number is a palindrome, false otherwise
    }

}
