package com.leetcode.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

//leetcode 169
public class MajorityElement {
    public static int findMajority(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int result = findMajority(arr);
        System.out.println(result);
    }
}
