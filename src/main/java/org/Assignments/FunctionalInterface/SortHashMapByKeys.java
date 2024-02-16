package org.Assignments.FunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeys {

    public static void main(String args[]) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> hm = new HashMap<>();

        // Add some key-value pairs to the HashMap
        hm.put(23, "Yash");
        hm.put(17, "Jash");
        hm.put(15, "Siddu");
        hm.put(9, "Nimisha");

        // Print the HashMap before sorting
        System.out.println("Before Sorting");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Roll no:  " + entry.getKey() + "     name:   " + entry.getValue());
        }

        // Create a TreeMap by passing the HashMap to its constructor
        // TreeMap automatically sorts the entries by keys
        Map<Integer, String> sortedHashMap = new TreeMap<>(hm);

        // Print the TreeMap after sorting
        System.out.println("\n");
        System.out.println("After Sorting");
        for (Map.Entry<Integer, String> entry : sortedHashMap.entrySet()) {
            System.out.println("Roll no:  " + entry.getKey() + "     name:   " + entry.getValue());
        }
    }
}
