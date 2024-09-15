package _2_BasicMaths;

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write code here
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = length * width;
        System.out.println(area);
    }

}
