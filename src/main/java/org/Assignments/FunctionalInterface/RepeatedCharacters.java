package org.Assignments.FunctionalInterface;
import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static Map<Character, Integer> repeatedCharacters(String s) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        // Convert the input string to lowercase to handle case-insensitive comparisons
        s = s.toLowerCase();

        // Loop through each character in the input string
        for (char c : s.toCharArray()) {
            // Increment the count for the current character in the map
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        // Create a new map to store only the characters with counts greater than 1
        Map<Character, Integer> repeatedCharactersMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedCharactersMap.put(entry.getKey(), entry.getValue());
            }
        }

        return repeatedCharactersMap;
    }
}
