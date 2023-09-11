// Java Implementation of Right Rotation
// of an Array K number of times

import java.util.*;
import java.lang.*;
import java.io.*;

class rotateKTimes {
    // Function to rightRotate array
    static void RightRotate(int a[], int n, int k) {
        // If rotation is greater
        // than size of array
        k = k % n;

        for (int i = 0; i < n; i++) {
            if (i < k) {                                // till i = k-1
                // Printing rightmost
                // kth elements
                System.out.print(a[n + i - k] + " ");   // [i=0 (5+0-2 = 3)] [i=1 (5+1-2 = 4)]
            } else {                                    // from i = k
                // Prints array after
                // 'k' elements
                System.out.print(a[i - k] + " ");
            }
        }
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int Array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int N = Array.length;
        int K = 4;
        RightRotate(Array, N, K);
    }
}
