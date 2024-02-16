package org.Assignments.Sets;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetForEach {

    // Method to convert a HashSet to an ArrayList using a for-each loop
    public static ArrayList<String> hashSetForEach(HashSet hs) {
        // Create a new ArrayList to store the elements
        ArrayList<String> fruits = new ArrayList<>();

        // Iterate through each element of the HashSet using a for-each loop
        for (Object element : hs) {
            // Add each element to the ArrayList after casting it to String
            fruits.add((String) element);
        }

        // Return the ArrayList containing the elements of the HashSet
        return fruits;
    }
}
