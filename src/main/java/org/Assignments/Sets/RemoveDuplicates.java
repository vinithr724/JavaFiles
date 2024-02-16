package org.Assignments.Sets;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}