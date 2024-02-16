package org.Assignments.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

    public HashSet<String> hashSetIterator(HashSet hs) {
        Iterator<String> iterator = hs.iterator();
        HashSet<String> fruits = new HashSet<>();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            //System.out.println(fruit);
            fruits.add(fruit);
        }
        return fruits;
    }
}