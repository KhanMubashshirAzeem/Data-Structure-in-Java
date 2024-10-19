package _7_String;

import java.util.Scanner;

public class StringClass1 {
    public static void main(String[] args) {
        char arr[] = {'a','p','f','q'};

        // Two ways for implementing the String.
        String str = "abcd";
        String str2 = "xyz";

        // Strings are mutable (unchanging over time or unable to be changed).
        Scanner scanner = new Scanner(System.in);
        String name;
//        name = scanner.next(); // It will take a word as a input
        name = scanner.nextLine(); // It will take a whole sentence as a input
        System.out.println(name);

        // String Functions
        String fullName = "Khan Mubashshir";
        // Print full length
        System.out.println(fullName.length());

        // Concatenation (the process of combining or joining two or more strings)
        String firstName = "Mubashshir";
        String lastName = "Khan";
        String fullName1 = firstName +" "+lastName;
        System.out.println(fullName1);

    }
}
