package strings;

import java.util.Arrays;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

public class ValidAnagram {

    public static void main(String[] args) {
        String testString1 = "anagram";
        String testString2 = "nagaram";
        String testString3 = "car";

        System.out.println(isAnagram(testString1, testString2));
        System.out.println(isAnagram(testString2, testString3));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);
        
        for (int i = 0; i < sCharArr.length; i++) {
            if (sCharArr[i] != tCharArr[i]) {
                return false;
            }
        }

        return true;
    }

}

// Convert to lowercase
// Convert to a char array
// Sort both inputs
// traverse
// if every char matches, then return true
// false otherwise