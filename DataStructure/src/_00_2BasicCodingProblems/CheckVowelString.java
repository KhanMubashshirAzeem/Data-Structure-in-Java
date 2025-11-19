package _00_2BasicCodingProblems;

public class CheckVowelString {
    public static void main(String[] args) {
        String str = "abc de fgh ijklmn opq urst wxyz";
        System.out.println(countVowels(str));
    }

    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                ++count;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        c = Character.toUpperCase(c);
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
