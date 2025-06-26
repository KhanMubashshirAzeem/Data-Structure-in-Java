package _001WonderBiz_DSA_Problem;

public class AvgOfArray {
    public static void main(String[] args) {
        int[] arr = {22, 3, 44, 5, 6, 77, 8, 99};
        int sumEle = 0, countEle = 0, avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sumEle = sumEle + arr[i];
            countEle++;
        }
        avg = sumEle/countEle;
        System.out.println("The average of array is "+avg);

    }

}
