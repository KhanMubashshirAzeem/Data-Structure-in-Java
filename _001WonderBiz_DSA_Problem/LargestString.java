package _001WonderBiz_DSA_Problem;

public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"Xpple", "mango", "banana"};

        String largestString = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largestString.compareTo(fruits[i]) < 0) {
                largestString = fruits[i];
            }
        }

        System.out.println(largestString);

    }
}
