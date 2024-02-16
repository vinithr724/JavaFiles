package org.Assignments.Maps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class StudentHashMapTest {
    @Test
    public void testGetStudentByName() {
        StudentHashMap studentHashMap = new StudentHashMap();


        Student john = studentHashMap.getStudentByName("John");
        assertNotNull(john, "Student John should exist");
        assertEquals("Last name should be Doe", john.lastName, "Doe");
        assertEquals("GPA should be 3.8", 3.8, john.gpa, 0.01);


        Student nonExistingStudent = studentHashMap.getStudentByName("NonExisting");
        assertNull(nonExistingStudent, "Non-existing student should be null");
    }
}