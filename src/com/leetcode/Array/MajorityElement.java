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
        int[] arr1 = {1,2,2,3,1,2};
        int result = findMajority(arr);
        int result1 = findMajority(arr1);
        System.out.println(result);
        System.out.println(result1);
    }
}
