package org.Assignments.Sets;

import org.Assignments.Sets.HashSetIterator;
import org.junit.Test;


import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class HashSetIteratorTest {
    @Test
    public void testHashSetIterator() {
        HashSetIterator h = new HashSetIterator();
        HashSet<String> hs = new HashSet<>();

        hs.add("Banana");
        hs.add("Grapes");
        hs.add("Apple");
        hs.add("Kiwi");
        hs.add("Orange");
        hs.add("Papaya");
        hs.add("Custer apple");
        hs.add("Pineapple");
        hs.add("Cherry");
        hs.add("Blackberry");


        HashSet<String> expectedOutput = new HashSet<>();
        expectedOutput.add("Banana");
        expectedOutput.add("Grapes");
        expectedOutput.add("Apple");
        expectedOutput.add("Kiwi");
        expectedOutput.add("Orange");
        expectedOutput.add("Papaya");
        expectedOutput.add("Custer apple");
        expectedOutput.add("Pineapple");
        expectedOutput.add("Cherry");
        expectedOutput.add("Blackberry");
        assertEquals(expectedOutput, h.hashSetIterator(hs));
    }
}