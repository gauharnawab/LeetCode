package com.leetcode.String;

public class FindLength {
    public static int findLengthOfTheLastWord(String s){
        String trim = s.trim();
        int afterLastIndex = trim.lastIndexOf(' ') + 1;
        return trim.length() - afterLastIndex;
    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        int result = findLengthOfTheLastWord(s);
        System.out.println(result);
    }
}
