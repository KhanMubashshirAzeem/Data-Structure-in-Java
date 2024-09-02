package BasicMaths;

public class CountDigit {
    public static void main(String[] args) {

        int num = 32, count = 0, lastDigit;

        System.out.printf(num + " contains total ");

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println(+count + " digits ");

    }
}


//
//// Function to count the number
//// of digits in an integer 'n'.
//public static int countDigits(int n) {
//    // Initialize a counter variable
//    // 'cnt' to store the count of digits.
//    int cnt = 0;
//    // While loop iterates until 'n'
//    // becomes 0 (no more digits left).
//    while (n > 0) {
//        // Increment the counter
//        // for each digit encountered.
//        cnt = cnt + 1;
//        // Divide 'n' by 10 to
//        // remove the last digit.
//        n = n / 10;
//    }
//    // Return the
//    // count of digits.
//    return cnt;
//}
//
//public static void main(String[] args) {
//    int N = 329823;
//    System.out.println("N: " + N);
//    int digits = countDigits(N);
//    System.out.println("Number of Digits in N: " + digits);
//}