package _00_2BasicCodingProblems;

public class SumOfDigits {
    public static void main(String[] args) {
        int digit = 456453;
//        System.out.println("This remove the last digit "+digit / 10 + "\nThis gives the last digit " + digit % 10);

        System.out.println("The sum of digit is "+sumDigit(digit));

    }

    private static int sumDigit(int digit) {
        int sum = 0;
        while (digit != 0) {
            // Extract the last digit
            int lastDigit = digit % 10;

            // Add last digit to sum
            sum += lastDigit;

            // Remove the last digit
            digit /= 10; // we add the last digit in sum therefore we are removing the last digit, so it can't be calculated again
        }
        return sum;
    }
}
