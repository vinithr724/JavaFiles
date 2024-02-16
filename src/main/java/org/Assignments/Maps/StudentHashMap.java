package org.Assignments.Maps;

import java.util.HashMap;

public class StudentHashMap {
    // HashMap to store student objects with their first names as keys
    private HashMap<String, Student> studentMap;

    // Constructor to initialize the HashMap and populate it with some sample data
    public StudentHashMap() {
        studentMap = new HashMap<>();
        initializeStudentMap(); // Call the method to populate the map with student data
    }

    // Method to populate the HashMap with sample student data
    private void initializeStudentMap() {
        // Add sample student objects to the HashMap with their first names as keys
        studentMap.put("John", new Student("John", "Doe", 3.8));
        studentMap.put("Jane", new Student("Jane", "Smith", 3.5));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.2));
        studentMap.put("Alice", new Student("Alice", "Williams", 4.0));
        studentMap.put("Charlie", new Student("Charlie", "Brown", 3.7));
        studentMap.put("Eva", new Student("Eva", "Davis", 3.9));
        studentMap.put("Frank", new Student("Frank", "Miller", 3.4));
        studentMap.put("Grace", new Student("Grace", "Jones", 3.1));
    }

    // Method to retrieve a student object by first name
    public Student getStudentByName(String firstName) {
        // Retrieve the student object associated with the provided first name from the HashMap
        // If the first name doesn't exist in the map, null is returned
        return studentMap.get(firstName);
    }
}
