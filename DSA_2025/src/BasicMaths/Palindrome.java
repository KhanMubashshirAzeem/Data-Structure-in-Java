package BasicMaths;

public class Palindrome {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int originalNumber = scanner.nextInt();

        int originalNumber = 15851; // Comment this before uncommenting scanner part

        int reversedNumber = 0;
        int tempNumber = originalNumber; // Use a temporary variable for manipulation

        // Reverse the number
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Add the digit to the reversed number
            tempNumber /= 10; // Remove the last digit from the temporary number
        }

        // Compare the original and reversed numbers
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

//        scanner.close();
    }
}
