package com.leetcode.String;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
    public int lenghtOfLongestSubString(String s){
        //using sliding window technique : TC = O(n) , SC O(n)
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int max = 0; //compare karega or valid window ko save karega
        while (right < s.length()){
            char c = s.charAt(right);//a
            if (set.add(c)){
                max = Math.max(max,right-left+1);//jab bhi windows ka size zyada hoga of max me save karega
                right++;
            }else{
                //ab agar character set me add nahi hua to hame pehlibar duplicate value mila
                //to hame us characer ko set se remove karna hai or left pointer ko ++ karna hai
                while (s.charAt(left) != c){
                    set.remove(s.charAt(left));
                    left++;
                }
                //actual character remove karenge
                set.remove(c);
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s =  "abcabcbb";
        LengthOfLongestSubString ss = new LengthOfLongestSubString();
        int result = ss.lenghtOfLongestSubString(s);
        System.out.println("lenght of longest substring is : " + result);
    }
}
