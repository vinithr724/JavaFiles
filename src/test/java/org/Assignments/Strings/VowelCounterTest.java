package org.Assignments.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCounterTest {

    @Test
    public void testCountVowels_NormalCase() {
        assertEquals(2, VowelCounter.countVowels("Hello"));
    }

    @Test
    public void testCountVowels_NoVowels() {
        assertEquals(0, VowelCounter.countVowels("bcdfg"));
    }


    @Test
    public void testCountVowels_EmptyString() {
        assertEquals(0, VowelCounter.countVowels(""));
    }

}
