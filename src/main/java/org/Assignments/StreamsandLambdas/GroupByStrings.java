package org.Assignments.StreamsandLambdas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStrings {

    // Method to group strings by their lengths
    public static Map<Integer, List<String>> strGroupThemByLen(List<String> li) {
        // Use streams and lambdas to group strings by their lengths

        // Convert the input list into a stream of strings
        return li.stream()
                // Collect the strings into groups based on their lengths using groupingBy collector
                .collect(Collectors.groupingBy(String::length));
    }
}

