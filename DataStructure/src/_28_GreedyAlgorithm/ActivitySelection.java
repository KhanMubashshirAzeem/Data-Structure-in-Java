package _28_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelection {
    public static void main(String[] args)
    {
        // Arrays representing the start and end times of activities
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        // Assuming the input activities are already sorted based on end time
        // (In real scenarios, we may need to sort them first using end times)

        int maxAct = 0;  // To count the maximum number of non-overlapping activities
        ArrayList<Integer> ans = new ArrayList<>();  // To store the indices of selected activities

        // Step 1: Select the first activity (greedy choice)
        maxAct = 1;        // First activity is always selected
        ans.add(0);        // Add index 0 to answer list
        int lastEnd = end[0];  // Store end time of the last selected activity

        // Step 2: Iterate through the rest of the activities
        for (int i = 1; i < end.length; i++) {
            // If the current activity starts after or at the end of the last selected activity
            if (start[i] >= lastEnd) {
                // Select the activity
                maxAct++;           // Increase count of selected activities
                ans.add(i);         // Store the index of the activity
                lastEnd = end[i];   // Update the last end time
            }
        }

        // Step 3: Print the result
        System.out.println("max activities = " + maxAct);  // Total activities selected
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));  // Print selected activity indices
        }

        System.out.println(); // For clean output spacing
    }
}
