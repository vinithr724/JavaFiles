package org.Assignments.StreamsandLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartsWithA {
    public static void main(String[] args) {
        // Define a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        // Filter names starting with "A" using stream and collect them into a new list
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        // Print filtered names
        System.out.println("Names starting with A: " + filteredNames); // Output: [Alice]

    }

    public static List<String> filterNamesStartingWithA(List<String> names) {
        return names;
    }
}
