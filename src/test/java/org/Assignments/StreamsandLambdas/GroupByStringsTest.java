package org.Assignments.StreamsandLambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GroupByStringsTest {

    @Test
    public void testStrGroupThemByLen() {
        // Input list of strings
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "grape");

        // Expected result: Map of lengths to lists of strings with the same length
        Map<Integer, List<String>> expectedResult = Map.of(
                5, Arrays.asList("apple", "grape"),
                6, Arrays.asList("banana", "orange")
        );

        // Invoke the method under test
        Map<Integer, List<String>> result = GroupByStrings.strGroupThemByLen(inputList);

        // Assert that the result matches the expected result
        Assertions.assertEquals(expectedResult, result);
    }
}
