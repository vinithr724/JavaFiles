package org.Assignments.FunctionalInterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListReversalTest {

    @Test
    public void testReverseList() {
        List<String> original = new ArrayList<>(Arrays.asList("Java", "is", "fun", "!"));
        List<String> expected = new ArrayList<>(Arrays.asList("!", "fun", "is", "Java"));

        assertEquals(expected, ListReversal.reverseList(original));
    }

    @Test
    public void testReverseList_EmptyList() {
        List<String> original = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        assertEquals(expected, ListReversal.reverseList(original));
    }

    @Test
    public void testReverseList_SingleElementList() {
        List<String> original = new ArrayList<>(Arrays.asList("Java"));
        List<String> expected = new ArrayList<>(Arrays.asList("Java"));

        assertEquals(expected, ListReversal.reverseList(original));
    }
    
}
