package _00_1WonderBiz_DSA_Problem.Strings;

public class SubString {
    public static void main(String[] args) {
        String str = "hello World";
        // logical function implemented manually
        System.out.println(subString(str, 0, 7));

        // Default functions given in String
        System.out.println(str.substring(0, 5));
    }

    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

}
