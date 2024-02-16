package org.Assignments.lists;
import java.util.ArrayList;

public class ListTraversal {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Adidas");
        stringList.add("Nike");
        stringList.add("Puma");
        stringList.add("New Balance");

        // Traverse using a for loop:
        System.out.println("Traversing using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}


// Explaination :
//import java.util.ArrayList;: This line imports the ArrayList class, which is a collection used to store elements in a resizable list.
//2. Create an ArrayList:
//
//ArrayList<String> stringList = new ArrayList<>();: This line creates an empty ArrayList called stringList that will specifically store String elements.
//3. Add elements to the ArrayList:
//
//stringList.add("Adidas");
//stringList.add("Nike");
//stringList.add("Puma");
//stringList.add("New Balance");: These lines add four different brand names to the stringList.
//4. Print a heading for the traversal:
//
//System.out.println("Traversing using for loop:");: This line prints a message indicating that the traversal using a for loop is about to begin.
//5. Traverse the ArrayList using a for loop:
//
//for (int i = 0; i < stringList.size(); i++): This for loop is used to iterate through each element in the stringList.
// Here's how it works:
// Initializes a variable i to 0, which will be used as the index to access elements in the list.
//The loop continues as long as i is less than the size of the stringList.
//After each iteration, the value of i is incremented by 1 to move to the next element in the list.
// Inside the loop, this line prints the element at the current index i of the stringList using the get method.
//The for loop effectively iterates through each element in the stringList, starting from index 0 and continuing until it reaches the end of the list.
// In each iteration, it prints the current element to the console.
