package _001WonderBiz_DSA_Problem;

import java.util.Scanner;

// Note - Strings in Java are Immutable (They can't be changed)
public class BasicStr {

    public static void main(String[] args) {

        // String declaration using literals and using new keyword
        String str = "abcd";
        String str1 = new String("wxyz");

        // Input & output

        // Scanner is used to take input from the user
        Scanner sc = new Scanner(System.in);
        String name; // declare a String variable

        // name = sc.next(); // This takes only a single word (till space)

        // This will take the entire line as input (including spaces)
        name = sc.nextLine();
        System.out.println(name); // print the user's input

        // Finding length of the entered string
        int stringLength = name.length();
        System.out.println(stringLength);

        // Concatenation – joining two strings together
        String lastName = "Khan";
        String fullName = name + " " + lastName;  // Combine first name and last name
        System.out.println(fullName);

        // charAt() – to get the character at a particular index
        System.out.println(name.charAt(0));  // Print the first character of the name

        // Print all characters of the string one by one using custom method
        printChar(name);

        // Check if the input string is a palindrome or not
        System.out.println(checkPalindrome(name));

        String path = "WNEENESENNNEEENN";
        System.out.println(getShortestPath1(path));
    }

    private static float getShortestPath1(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int x2 = x * x, y2 = y * y;
        System.out.printf("The co ordinate is - ");
        return (float) Math.sqrt(x2 + y2);
    }

    // Method to check if a string is a palindrome
    private static boolean checkPalindrome(String name) {
        // Loop runs from start to the middle of the string
        for (int i = 0; i < name.length() / 2; i++) {
            // Compare the i-th character from start with the i-th character from end
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                // If any character doesn't match, it's not a palindrome
                return false;
            }
        }
        // If all characters match in the loop, it is a palindrome
        return true;
    }

    // Method to print each character of the string
    public static void printChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            // Print each character followed by a space
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(); // Move to the next line after printing all characters
    }
}
