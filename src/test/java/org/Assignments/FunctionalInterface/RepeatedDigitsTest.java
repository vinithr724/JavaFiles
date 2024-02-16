package org.Assignments.FunctionalInterface;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RepeatedDigitsTest {


    @Test
    public void testRepeatedDigits_NoRepeats() {
        Map<Integer, Integer> expected = new HashMap<>();

        assertEquals(expected, RepeatedDigits.repeatedDigits(123456789));
    }


    @Test
    public void testRepeatedDigits_AllRepeated() {
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(2, 3);

        assertEquals(expected, RepeatedDigits.repeatedDigits(222));
    }



    @Test
    public void testRepeatedDigits_NegativeNumber() {
        Map<Integer, Integer> expected = new HashMap<>();

        assertEquals(expected, RepeatedDigits.repeatedDigits(-123456789));
    }

    @Test
    public void testRepeatedDigits_Zero() {
        Map<Integer, Integer> expected = new HashMap<>();

        assertEquals(expected, RepeatedDigits.repeatedDigits(0));
    }
}
