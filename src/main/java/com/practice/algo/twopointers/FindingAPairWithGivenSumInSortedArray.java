package com.practice.algo.twopointers;

import java.util.Arrays;

public class FindingAPairWithGivenSumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9, 10};
        int targetSum = 10;
        int[] result = findPairWithSum(arr, targetSum);

        if (result.length == 2) {
            System.out.println("Pair found: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found.");
        }
    }

    private static int[] findPairWithSum(int[] arr, int targetSum) {
        return null;
    }


}
