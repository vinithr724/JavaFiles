package org.Assignments.StreamsandLambdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumStringTest {

    @Test
    public void testMaximumElementInList() {
        // Define input list
        List<Integer> inputList = Arrays.asList(1, 5, 3, 9, 2);

        // Call the method under test
        List<Integer> result = MaximumString.maximumElementInList(inputList);

        // Assert the result
        assertEquals(9, result.get(0), "Maximum element should be 9");
    }

    @Test
    public void testEmptyList() {
        // Define an empty list
        List<Integer> emptyList = Arrays.asList();

        // Call the method under test
        List<Integer> result = MaximumString.maximumElementInList(emptyList);

        // Assert that the result is an empty list
        assertEquals(0, result.size(), "Result should be an empty list");
    }
}
