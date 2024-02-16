package org.Assignments.Arrays;

public class ArrayRotation {

    public static void rotateL(int[] arr, int x) {
        // Handle negative and large rotations using modular arithmetic
        x = x % arr.length;
        if (x < 0) {
            x = x + arr.length;
        }

        // Reverse the first x elements
        reverse(arr, 0, x - 1);

        // Reverse the remaining elements
        reverse(arr, x, arr.length - 1);

        // Reverse the entire array
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // A method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // A main method to test the program
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // change the array values here
        System.out.println("Original array:");
        printArray(arr);
        rotateL(arr, 2); // change the x value here
        System.out.println("Rotated array:");
        printArray(arr);
    }

}

