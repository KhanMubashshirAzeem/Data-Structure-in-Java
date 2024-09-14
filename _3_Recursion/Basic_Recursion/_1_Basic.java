package _3_Recursion.Basic_Recursion;

public class _1_Basic {
    public static void main(String[] args) {
        int count = 0;
        callFunction(count);
    }

    private static void callFunction(int count) {
        if (count == 4)
            return;
        System.out.println(count);
        count++;
        callFunction(count);

    }


}
