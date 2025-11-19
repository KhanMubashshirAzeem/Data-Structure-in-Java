package _4_TCS_NQT;

public class Reverse_a_Number {
    public static void main(String[] args) {
        int num = 7789;
        final int finalNum = num;
        int countIn = 0;
        int revNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;   // get the last digit of the number.
            revNum = (revNum * 10) + lastDigit;
            num = num / 10; // we will get the number excluding the last digit
        }
        System.out.println("The reverse number of " + finalNum + " is " + revNum);

    }
}
