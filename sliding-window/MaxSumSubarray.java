//Given an array of positive numbers and a positive number k, find the maximum sum of any contiguous subarray of size k.

public class MaxSumSubarray {

    public static void main(String[] args) {
        System.out.println(findMaxSum(new int[] { 4, 2, 1, 7, 8, 9, 2, 9, 1 }, 4));
    }

    public static int findMaxSum(int[] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currRunningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currRunningSum += arr[i];
            if (i >= k - 1) {
                maxValue = Math.max(maxValue, currRunningSum);
                currRunningSum -= arr[i -(k - 1)]; //subtract the furthest right value
            }
        }

        return maxValue;
    }

}