package com.leetcode.Array;

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);//after sorted 1 1 2 3
        for (int i = 1; i < n; i++){
            if (nums[i] == nums[i-1]);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println("result : " + result);
    }
}

//Input: nums = [1,2,3,1]
//Output: true