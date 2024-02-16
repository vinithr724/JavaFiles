package org.Assignments.StreamsandLambdas;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortStringsTest {

    @Test
    public void testSortBasedOnLength() {
        String[] array = {"banana", "apple", "grapes", "cherry", "kiwi", "strawberry"};
        String[] expected = {"kiwi", "apple", "banana", "grapes", "cherry", "strawberry"};
        String[] result = SortStrings.sortBasedOnLength(array);
        assertArrayEquals(expected, result);
    }

}
