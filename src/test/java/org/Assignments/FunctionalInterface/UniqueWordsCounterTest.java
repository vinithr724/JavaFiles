package org.Assignments.FunctionalInterface;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueWordsCounterTest {

    @Test
    public void testCountUniqueWords() {
        String text = "This is a test text with some test words and some unique words";
        assertEquals(10, UniqueWordsCounter.countUniqueWords(text));
    }

    @Test
    public void testCountUniqueWords_AllSameWords() {
        String text = "word word word word";
        assertEquals(1, UniqueWordsCounter.countUniqueWords(text));
    }

    @Test
    public void testCountUniqueWords_DifferentCasing() {
        String text = "word Word WORD WoRd";
        assertEquals(1, UniqueWordsCounter.countUniqueWords(text));
    }

    @Test
    public void testCountUniqueWords_MultipleSpaces() {
        String text = "word     word   word";
        assertEquals(1, UniqueWordsCounter.countUniqueWords(text));
    }

    @Test
    public void testCountUniqueWords_SpecialCharacters() {
        String text = "word! word@ word# word$ word%";
        assertEquals(5, UniqueWordsCounter.countUniqueWords(text));
    }
}
