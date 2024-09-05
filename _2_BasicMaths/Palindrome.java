package _2_BasicMaths;

public class Palindrome {
    public static void main(String[] args) {
        int num;
        checkPalindrome(num = 34343);

    }

    private static boolean checkPalindrome(int num) {
        final int finalNum = num;
        int countIn = 0;
        int revNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;   // get the last digit of the number.
            revNum = (revNum * 10) + lastDigit;
            num = num / 10; // we will get the number excluding the last digit
        }
        if (finalNum == revNum) {
            System.out.println("Its palindrome");
            return true;
        } else System.out.println("Its not a palindrome");
        return false;
    }
}
