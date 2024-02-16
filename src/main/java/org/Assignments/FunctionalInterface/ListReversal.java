package org.Assignments.FunctionalInterface;
import java.util.ArrayList;
import java.util.List;

public class ListReversal {

    public static List<String> reverseList(List<String> inputList) {
        List<String> reversed = new ArrayList<>();

        // Iterate through the input list in reverse order
        for (int i = inputList.size() - 1; i >= 0; i--) {
            reversed.add(inputList.get(i));
        }

        return reversed;
    }

   /* public static void main(String[] args) {
        List<String> original = new ArrayList<>();
        original.add("Java");
        original.add("is");
        original.add("fun");
        original.add("!");

        System.out.println("Original List: " + original);

        List<String> reversed = reverseList(original);

        System.out.println("Reversed List: " + reversed);
    }*/
}

// Explaination of the code:
// List<String> reversed = new ArrayList<>();:
// This line creates an empty ArrayList called reversed to store the reversed elements.
// Reverse traversal using a for loop:
// for (int i = inputList.size() - 1; i >= 0; i--):
// This loop iterates through the inputList in reverse order, starting from the last element (inputList.size() - 1)
// and decrementing the index i until it reaches 0.
// Add elements in reverse order:
// reversed.add(inputList.get(i));:
// Inside the loop, each element at the current index i of the inputList is added to the reversed list.
// This effectively builds the reversed list.
// return reversed;: After the loop completes, the function returns the reversed list,
// containing the elements in reversed order.
