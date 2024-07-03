package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramHashMap {

    public static void main(String[] args) {
        String testString1 = "anagram";
        String testString2 = "nagaram";
        String testString3 = "car";

        System.out.println(isAnagram(testString1, testString2));
        System.out.println(isAnagram(testString2, testString3));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        if(s.isEmpty() || t.isEmpty()){
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>(); // create an unordered map to store char frequencies

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        for (char i : sCharArr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (char i : tCharArr) {
            map.put(i, map.getOrDefault(i, 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;

    }
}
