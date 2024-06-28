//Given an array of positive integers and a number S, find the length of the smallest contiguous subarray whose sum is greater or equal to S. Return 0 if no such subarray exists.

public class SmallestSubarrayGivenSum {

    public static void main(String[] args) {
        int[] testArr = new int[] { 4, 8, 2, 1, 7 };
        System.out.println(findSmallestSubarray(testArr, 8));
    }

    public static int findSmallestSubarray(int[] arr, int s) {
        int windowStart = 0;
        int currentWindowSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];
            while(currentWindowSum >= s){
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);//a delta of how large our curr window exactly
                    currentWindowSum -= arr[windowStart]; //the shrinking process
                    windowStart++;
                }
            }
        return minWindowSize;
    }

}
