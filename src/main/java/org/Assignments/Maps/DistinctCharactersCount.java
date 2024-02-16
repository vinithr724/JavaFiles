package org.Assignments.Maps;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharactersCount {
    // Method to count the occurrences of distinct characters in a string
    public static Map<Character, Integer> countDistinctCharacters(String input) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to lowercase to ensure case insensitivity
        input = input.toLowerCase();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // Increment the count for the current character in the map
            // If the character is not already present, add it with a count of 1
            // If it's already present, increment its count by 1
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Return the map containing counts of distinct characters
        return charCountMap;
    }
}
