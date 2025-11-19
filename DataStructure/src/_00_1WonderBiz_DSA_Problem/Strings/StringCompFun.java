package _00_1WonderBiz_DSA_Problem.Strings;

public class StringCompFun {
    public static void main(String[] args) {
        // String literals are stored in String Constant Pool
        // If the same literal already exists in the pool, Java reuses it
        String s1 = "khan";
        String s2 = "khan"; // Points to the same "khan" object in the String Pool as s1

        // 'new' keyword always creates a new object in the Heap memory,
        // even if the content is same as an existing string in the pool
        String s3 = new String("khan");

        // == compares **references**, not values
        // s1 and s2 both refer to the same object in the String Pool
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // s2 refers to String Pool object, s3 refers to new Heap object
        // Though contents are same, references are different
        if (s3 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Recommended way to compare actual content/values:
        if (s3.equals(s2)) {
            System.out.println("Using equals(): Strings are equal");
        }
    }
}
