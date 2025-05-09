package com.miguelromero717.java_study;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(findLongest("ABDEFGABEF"));
        System.out.println(findLongest("BBBB"));
        System.out.println(findLongest("GEEKSFORGEEKS"));
    }

    public static int findLongest(String word) {
        if (word == null || word.length() < 1) return 0;

        int left = 0;
        int result = 0;
        var setChars = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            var current = word.charAt(i);
            while (setChars.contains(current)) {
                setChars.remove(word.charAt(left));
                left++;
            }
            setChars.add(current);
            result = Math.max((i - left + 1), result);
        }

        return result;
    }
}
