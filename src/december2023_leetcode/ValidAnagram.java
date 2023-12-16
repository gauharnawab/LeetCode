package december2023_leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars,tChars);
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        // Example usage:
        String s1 = "anagram";
        String s2 = "nagaram";

        if (va.isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
