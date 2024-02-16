package org.Assignments.Threads;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class SingletonTest {

    @Test
    public void testGetInstance() {
        // Get the singleton instance
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if the instances are not null
        assertNotNull(instance1);
        assertNotNull(instance2);

        // Check if both instances are the same (i.e., the same object reference)
        assertSame(instance1, instance2);
    }

    @Test
    public void testSingletonContent() {
        // Get the singleton instance
        Singleton instance = Singleton.getInstance();

        // Check if the content of the singleton instance matches the expected string
        assertEquals("It is an example of a singleton class.", instance.str);
    }
}
