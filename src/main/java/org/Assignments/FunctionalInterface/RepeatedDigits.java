package org.Assignments.FunctionalInterface;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;

public class RepeatedDigits {
    public static HashMap<Integer, Integer> repeatedDigits(int n) {
        HashMap<Integer, Integer> digitCountMap = new HashMap<>();

        // Extract each digit from the number
        while (n != 0) {
            int digit = n % 10;
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
            n /= 10;
        }

        // Remove single occurrence digits from the map
        digitCountMap.entrySet().removeIf(entry -> entry.getValue() == 1);

        return digitCountMap;
    }
}

