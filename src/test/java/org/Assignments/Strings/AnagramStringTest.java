package org.Assignments.Strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramStringTest {

    @Test
    public void testAreAnagrams_SameStrings() {
        assertTrue(AnagramString.areAnagrams("listen", "listen"));
    }

    @Test
    public void testAreAnagrams_Anagrams() {
        assertTrue(AnagramString.areAnagrams("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_AnagramsIgnoreCase() {
        assertTrue(AnagramString.areAnagrams("LiStEn", "sIlEnT"));
    }

    @Test
    public void testAreAnagrams_NotAnagrams() {
        assertFalse(AnagramString.areAnagrams("hello", "world"));
    }

    @Test
    public void testAreAnagrams_DifferentLengths() {
        assertFalse(AnagramString.areAnagrams("listen", "listens"));
    }

    @Test
    public void testAreAnagrams_SameCharactersDifferentOrder() {
        assertFalse(AnagramString.areAnagrams("listen", "silentt"));
    }

    @Test
    public void testAreAnagrams_EmptyStrings() {
        assertTrue(AnagramString.areAnagrams("", ""));
    }

    @Test
    public void testAreAnagrams_Spaces() {
        assertTrue(AnagramString.areAnagrams("listen", "silent "));
    }
}
