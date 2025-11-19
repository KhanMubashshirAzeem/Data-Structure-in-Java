package _3_Recursion.Basic_Recursion;

public class _1_Basic {
    public static void main(String[] args) {
        int count = 1;
        callFunction(count);
    }

    private static int callFunction(int count) {
        if (count == 6)
            return 0;
        int result = (int) Math.pow(count,3);
        System.out.println(result);
        count++;
        int i = callFunction(result + result - 1);
        return i;
    }


}
