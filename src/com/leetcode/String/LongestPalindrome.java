package com.leetcode.String;

// Longest palindromic substring
// Algorithm used: expandAroundCentre

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCentre(s, i, i + 1);
            int len2 = expandAroundCentre(s, i, i);
            int length = Math.max(len1, len2);

            if (length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    int expandAroundCentre(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {
        LongestPalindrome ll = new LongestPalindrome();
        String s = "babad";
        String res = ll.longestPalindrome(s);
        System.out.println("Longest Palindromic Substring is : " + res);
    }
}
