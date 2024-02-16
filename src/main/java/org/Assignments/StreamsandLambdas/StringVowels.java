package org.Assignments.StreamsandLambdas;

import java.util.List;
import java.util.stream.Collectors;

public class StringVowels {
    public static List<String> stringContainsVowels(List<String> li) {
        // Check if the input list is empty
        if (li.isEmpty()) {
            // If it is empty, return the input list as is
            return li;
        }

        // Use streams and lambdas to filter strings containing vowels
        return li.stream()
                // Convert each string to lowercase for case-insensitive comparison
                .map(String::toLowerCase)
                // Filter strings containing at least one vowel
                .filter(s -> s.matches(".*[aeiou].*"))
                // Collect the filtered strings into a new list
                .collect(Collectors.toList());
    }
}
