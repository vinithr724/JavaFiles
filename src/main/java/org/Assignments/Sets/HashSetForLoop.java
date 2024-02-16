package org.Assignments.Sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetForLoop {

    // Method to convert a HashSet to an ArrayList using a for loop
    public static ArrayList<String> hashSetForLoop(HashSet hs) {
        // Create a new ArrayList to store the elements
        ArrayList<String> al = new ArrayList<>();

        // Create an array with the same size as the HashSet to store its elements
        String[] p = new String[hs.size()];

        // Convert the HashSet to an array
        hs.toArray(p);

        // Iterate through the array using a for loop
        for (int i = 0; i < p.length; i++) {
            // Add each element of the array to the ArrayList
            al.add(p[i]);
        }

        // Return the ArrayList containing the elements of the HashSet
        return al;
    }

/*    // Main method to test the HashSetForLoop class
    public static void main(String[] args) {
        // Create a HashSet and add some elements to it
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");

        // Convert the HashSet to an ArrayList using the hashSetForLoop method
        ArrayList<String> result = hashSetForLoop(hs);

        // Print the elements of the resulting ArrayList
        System.out.println("ArrayList: " + result);
    }*/
}


