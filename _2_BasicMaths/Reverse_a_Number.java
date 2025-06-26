package _2_BasicMaths;

public class Reverse_a_Number {
    public static void main(String[] args) {
        int num = 171;
        final int finalNum = num;
        int revNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;   // get the last digit of the number.
            revNum = (revNum * 10) + lastDigit;
            num = num / 10; // we will get the number excluding the last digit
        }
        System.out.println("The reverse number of " + finalNum + " is " + revNum);

        if (revNum == finalNum){
            System.out.println(revNum+" is equal to "+finalNum+" therefore it is palindrome");
        }else {
            System.out.println(revNum+" is not equal to "+finalNum+" therefore it is not a palindrome");
        }

    }
}
