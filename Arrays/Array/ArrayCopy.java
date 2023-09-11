package Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {12,15,19};
        int[] b = new int[a.length];

        for(int i=0;i<a.length;i++)
            b[i] = a[i];

        b[0]++;

        System.out.println("Contents of a[] ");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        // Display message only
        System.out.println("\n\nContents of b[] ");

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");


    }
}
