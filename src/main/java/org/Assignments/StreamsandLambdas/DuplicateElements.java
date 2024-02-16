package org.Assignments.StreamsandLambdas;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static List<Integer> removeDuplicatesFromList(List<Integer> li) {
        // Use streams and lambdas to remove duplicates from the list
        return li.stream()
                .distinct()            // Keep only distinct elements
                .collect(Collectors.toList());  // Collect the elements into a new list
    }
}

