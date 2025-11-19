package _7_String;

public class function {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // Are equal
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Are not equal because Interning (s1 is stored in already existing String but s3 is stored in new String)
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }

        // To compare the value os String use ".equal" to
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}
