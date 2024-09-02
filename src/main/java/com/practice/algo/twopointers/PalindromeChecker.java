package com.practice.algo.twopointers;

import java.util.Objects;

public class PalindromeChecker {

    public static void main(String[] args) {
        String[] str = {"racecar" , "sample", "a", "abba", "AbBa"};

        for (String s : str) {
            System.out.println(s + " is " +  getLogStr(isPalindrome(s)));
        }


    }

    private static String getLogStr(boolean palindrome) {
        return palindrome ? "Palindrome" : "not a palindrome";
    }
    private static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0) return false;

        int left =0;
        int right = str.length() -1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
