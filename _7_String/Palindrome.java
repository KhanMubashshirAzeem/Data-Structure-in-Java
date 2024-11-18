package _7_String;

// The word that are same from right to left = left to write.
public class Palindrome {
    public static void main(String[] args) {
        String str = "moon";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}

