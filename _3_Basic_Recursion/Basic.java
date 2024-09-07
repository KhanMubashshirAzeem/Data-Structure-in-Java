package _3_Basic_Recursion;

public class Basic {
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
