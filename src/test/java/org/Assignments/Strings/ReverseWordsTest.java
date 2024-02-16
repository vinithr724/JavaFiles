package org.Assignments.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void testReverseWord_SingleWord() {
        assertEquals("world", ReverseWords.reverseWord("world"));
    }

    @Test
    public void testReverseWord_MultipleWords() {
        assertEquals("Hello world", ReverseWords.reverseWord("world Hello"));
    }

    @Test
    public void testReverseWord_EmptyString() {
        assertEquals("", ReverseWords.reverseWord(""));
    }

    @Test
    public void testReverseWord_NullString() {
        assertNull(ReverseWords.reverseWord(null));
    }

    @Test
    public void testReverseWord_SingleCharacter() {
        assertEquals("a", ReverseWords.reverseWord("a"));
    }

    @Test
    public void testReverseWord_MultipleSpaces() {
        assertEquals("a b c", ReverseWords.reverseWord("c b   a"));
    }

    @Test
    public void testReverseWord_WithPunctuation() {
        assertEquals("world! Hello,", ReverseWords.reverseWord("Hello, world!"));
    }

    @Test
    public void testReverseWord_LeadingTrailingSpaces() {
        assertEquals("world Hello", ReverseWords.reverseWord(" Hello world "));
    }
}
