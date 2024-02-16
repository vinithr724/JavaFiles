package org.Assignments.lists;
import java.util.ArrayList;

public class RemoveList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Adidas");
        stringList.add("Nike");
        stringList.add("Puma");
        stringList.add("New Balance");

        // Print the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Remove the last object in the ArrayList
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);

            // Print the ArrayList after removal
            System.out.println("ArrayList after removing the last element: " + stringList);
        } else {
            System.out.println("ArrayList is empty. No elements to remove.");
        }
    }
}

// Explaination:
// ArrayList Initialization:
// ArrayList<String> stringList = new ArrayList<>();
// This line creates an ArrayList named stringList that holds elements of type String. It is initially empty.

// Conditional Check for Non-emptiness:
// if (!stringList.isEmpty()) {
// This block checks whether the ArrayList is not empty.
// If it's not empty, the code inside the block will be executed.
// stringList.remove(stringList.size() - 1);
// This line removes the last element from the ArrayList.
// It uses stringList.size() - 1 to get the index of the last element.