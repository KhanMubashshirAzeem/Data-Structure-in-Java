package HashMap;


import java.util.HashMap;
import java.util.Map;

/* Key -> element of Array
 *  Value -> Freq of element */
public class MostFrequentEle {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 1, 2, 1, 1, 4, 3, 1, 2, 1};
        findMostFreqELe(arr);

    }

    static void findMostFreqELe(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int ele : arr) {
            if (!freq.containsKey(ele)) {        // Check if element present for 1st time
                freq.put(ele, 1);               //  if 1st time then put ele frequency = 1
            } else {
                freq.put(ele, freq.get(ele) + 1);   // If already exist then just update
            }
        }
        System.out.println("Frequency Map " + freq.entrySet());

        int maxFreq = 0, ansKey = -1;
        for (var e: freq.entrySet()){
            if (e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }

        System.out.printf("%d has max frequency and it occurs %d times ",ansKey,maxFreq);
    }



}
