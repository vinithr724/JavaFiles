package org.Assignments.StreamsandLambdas;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class DuplicateElementsTest {

    @Test
    public void testRemoveDuplicatesFromList() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 2, 1, 3, 4, 5, 4, 3, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5); // Expected list without duplicates
        List<Integer> result = DuplicateElements.removeDuplicatesFromList(inputList);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicatesFromList_EmptyList() {
        List<Integer> inputList = Arrays.asList();
        List<Integer> expected = Arrays.asList(); // Expected empty list
        List<Integer> result = DuplicateElements.removeDuplicatesFromList(inputList);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicatesFromList_AllDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> expected = Arrays.asList(1); // Expected list with only one element (all duplicates removed)
        List<Integer> result = DuplicateElements.removeDuplicatesFromList(inputList);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicatesFromList_NoDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5); // Expected list remains unchanged
        List<Integer> result = DuplicateElements.removeDuplicatesFromList(inputList);
        assertEquals(expected, result);
    }

}
