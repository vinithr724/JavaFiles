package org.Assignments.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("Apple", "Banana", "Orange", "Grapes"));

        // Convert ArrayList to array using list comprehension:
        String[] stringArray = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            stringArray[i] = stringList.get(i);
        }

        System.out.println("ArrayList: " + stringList);
        System.out.println("Converted Array: " + Arrays.toString(stringArray));
    }
}

// Explaination :
// The code starts by creating an empty array stringArray with the same size as the stringList.
// The for loop iterates through the elements of the stringList and directly assigns them to the corresponding indices of the stringArray. This condenses the logic of traditional for loops into a more concise syntax.
// The code then prints both the original stringList and the converted stringArray.