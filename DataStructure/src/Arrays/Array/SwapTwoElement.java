package Arrays.Array;

public class SwapTwoElement {

    public static void main(String[] args) {
        String[] arr = {"first","second","third","fourth"};

        System.out.println("Array before swapping : ");
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println(" ");

        String temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        System.out.println("Array after swapping : ");
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }

    }
}
