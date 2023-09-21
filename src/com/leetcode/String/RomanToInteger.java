package com.leetcode.String;

public class RomanToInteger {

    public int getVal(char ch){
        switch (ch){
            case 'I' : return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s){
        int n = s.length();
        int sum = 0; // This variable stores the sum of the Roman numeral values.
        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if ((i + 1) < n && getVal(ch) < getVal(s.charAt(i + 1))) {
                sum -= getVal(ch); // Subtract when a smaller value comes before a larger value.
            } else {
                sum += getVal(ch); // Add the current value to the sum.
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger rr = new RomanToInteger();
        String str = "IV";
        int result = rr.romanToInt(str); // Store the result as an int.
        System.out.println("Roman to Integer Value is : " + result);
    }
}
