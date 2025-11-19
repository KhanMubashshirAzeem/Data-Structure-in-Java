package _2_BasicMaths.Euclidean_Algorithm;

public class GCD_ {
    public static void main(String[] args) {
        int num = 50, num2 = 10;
        method1(num, num2);

    }

    private static void method1(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if (n1 == 0) {
            System.out.println(+n2 + " is GCD");
        } else System.out.println(+n1 + " is GCD");

    }

}
