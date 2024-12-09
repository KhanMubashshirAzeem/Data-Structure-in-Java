package _7_String;

// This class is designed to find the lexicographically largest string in an array of strings
public class printLargestString {
    public static void main(String[] args) {
        // Array of strings representing different fruits
        String fruits[] = {"Zapple", "mango", "banana"};

        // Assume the first string in the array is the largest initially
        String largest = fruits[0];

        // Iterate over each string in the array
        for (int i = 0; i < fruits.length; i++) {
            // Compare the current largest string with the string at position i
            // Time complexity of compareTo is O(k) where k is the length of the string being compared
            if (largest.compareTo(fruits[i]) < 0) {
                // If the string at index i is lexicographically larger, update 'largest'
                largest = fruits[i];
            }
        }

        // Print the lexicographically largest string found
        System.out.println(largest);

        // Time complexity breakdown:
        // - The for loop runs n times, where n is the length of the array 'fruits'
        // - Inside the loop, the compareTo operation takes O(k) time where k is the length of the strings
        // - In the worst case, compareTo compares all characters of the two strings.
        // - Therefore, the total time complexity is O(n * k), where:
        //    - n = number of elements in the array
        //    - k = maximum length of a string in the array

        // Space complexity breakdown:
        // - We are only using a few extra variables:
        //   - fruits[]: holds the array of strings (space taken by the input)
        //   - largest: a single string variable
        // - There are no additional data structures used that grow with the input size
        // - Thus, the space complexity is O(1), i.e., constant space, aside from the input storage.
    }
}
