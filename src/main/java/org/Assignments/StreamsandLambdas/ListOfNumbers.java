package org.Assignments.StreamsandLambdas;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfNumbers {
        public static List<Integer> filterEvenNumThenDouble(List<Integer> li) {
            // Start with the input list
            return li.stream()
                    // Filter out even numbers
                    .filter(number -> number % 2 == 0)
                    // Map each even number to its double
                    .map(number -> number * 2)
                    // Collect the results into a new list
                    .collect(Collectors.toList());
        }
    }
