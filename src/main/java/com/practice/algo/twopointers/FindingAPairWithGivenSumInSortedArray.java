package com.practice.algo.twopointers;

import java.util.Arrays;

public class FindingAPairWithGivenSumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9, 10};
        int targetSum = 101;
        int[] result = findPairWithSum(arr, targetSum);


        System.out.println("Matched Pair  " + Arrays.toString(result));

    }

    /**
     *
     * Initialize 2 pointers left(first element), right(last element)
     *
     * if sum of left and right elements is target - return the elements
     * else if the sum is greater than target - move the right pointer one step to left
     * else move the left ptr one step to right.
     *
     * @param arr
     * @param targetSum
     * @return
     */
    private static int[] findPairWithSum(int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int currentSum = arr[left] + arr[right];
            if(currentSum == targetSum){
                return new int[]{arr[left], arr[right]};
            } else if ( currentSum > targetSum) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }


}
