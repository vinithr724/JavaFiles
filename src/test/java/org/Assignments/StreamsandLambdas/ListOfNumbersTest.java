package org.Assignments.StreamsandLambdas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOfNumbersTest {

    @Test
    public void testFilterEvenNumThenDouble() {
        // Input list
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Expected output list after filtering even numbers and doubling
        List<Integer> expectedOutput = Arrays.asList(4, 8, 12, 16, 20);

        // Call the method being tested
        List<Integer> actualOutput = ListOfNumbers.filterEvenNumThenDouble(inputList);

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }
}
