package org.Assignments.StreamsandLambdas;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumString {
    public static List<Integer> maximumElementInList(List<Integer> li) {
        // Find the maximum element in the list using the 'max' method
        // The 'max' method returns an Optional containing the maximum element
        // We use 'orElse' to provide a default value (empty list) if the input list is empty
        return li.stream()
                .max(Integer::compareTo) // Compare integers to find the maximum
                .stream() // Convert the Optional to a Stream
                .collect(Collectors.toList()); // Collect the result into a List
    }
}

