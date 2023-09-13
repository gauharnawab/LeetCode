package com.leetcode.String;

//leetcode 20
import java.util.Stack;

public class ValidParanthesis {

    public  boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();

        // Test cases
        String test1 = "(]";
        String test2 = "{[(])}";
        String test3 = "()";

        System.out.println(vp.isValid(test1));
        System.out.println(vp.isValid(test2));
        System.out.println(vp.isValid(test3));

    }
}
