package _00_1WonderBiz_DSA_Problem.Strings;

public class LargestDivisibleByN {

    public static void main(String[] args) {
        int num = 2112, n = 6;
        check(num, n);
    }

    static void check(int number, int n) {
        if (number % n == 0) {
            System.out.println(n + " is divisible by " + number);
        } else System.out.println(n + " is not divisible by " + number);
    }

}
