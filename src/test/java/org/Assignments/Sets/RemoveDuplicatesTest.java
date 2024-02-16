package org.Assignments.Sets;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        String inputString = "programming";


        String resultString = RemoveDuplicates.removeDuplicates(inputString);

        assertEquals("progamin",resultString);
    }
}