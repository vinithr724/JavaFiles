package org.Assignments.Arrays;

public class LinearSearch {

    // A method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int index = 0; index < arr.length; index++) {
            // Check if the current element is equal to the target
            if (arr[index] == target) {
                // If found, return the index
                return index;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    // A sample main method to test the linear search method
    public static void main(String[] args) {
        // An example array of integers
        int[] arr = {3, 7, 2, 4, 9, 6};
        // An example element to search
        int target = 9;
        // Call the linear search method and print the result
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println(target + " is not present in the array");
        } else {
            System.out.println(target + " is present at index " + index);
        }
    }
}
