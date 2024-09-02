package com.practice.algo.twopointers;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5, 7, 9, 9, 10};

        System.out.println("No of unique elements " + removeDuplictaes(arr));
    }

    private static int removeDuplictaes(int[] arr) {

        if(arr.length == 0) return 0;

        int slow = 0;
        int length = arr.length;
        for(int fast = 1; fast < length ; fast++) {
            System.out.println(slow + " -- " + fast);
            if(arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow;
    }
}
