package _7_String;

// Continuous part of a String
// Helloworld -> Hello | World | hell
public class SubString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));
        // but in Java there is inbuilt function for subString see the example below.
        System.out.println(str.substring(0, 5));
    }

    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }


}
