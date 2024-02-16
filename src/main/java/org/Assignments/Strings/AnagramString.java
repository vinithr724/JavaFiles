package org.Assignments.Strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length())
            return false;

        // Map to store the count of characters in both strings
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character of both strings
        for (int i = 0; i < str1.length(); i++) {
            char charFromStr1 = str1.charAt(i);
            char charFromStr2 = str2.charAt(i);

            // Update the count of characters in the map for both strings
            charCountMap.put(charFromStr1, charCountMap.getOrDefault(charFromStr1, 0) + 1);
            charCountMap.put(charFromStr2, charCountMap.getOrDefault(charFromStr2, 0) - 1);
        }

        // Check if all counts in the map are zero
        for (int count : charCountMap.values()) {
            if (count != 0)
                return false;
        }

        // If all counts are zero, the strings are anagrams
        return true;
    }
}
   /* public static void main(String[] args) {
        String string1 = "Listen";
        String string2 = "Silent";

        // Check if strings are anagrams and print the result
        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}*/
