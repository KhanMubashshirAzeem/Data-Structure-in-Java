package BasicMaths;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 12345; // The number to be reversed
        int reversedNum = 0; // Variable to store the reversed number

        // Loop until the original number becomes 0
        while (num != 0) {
            int digit = num % 10; // Get the last digit of the number
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reversedNum); // Print the reversed number
    }
}