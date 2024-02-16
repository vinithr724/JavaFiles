package org.Assignments.loops;
public class Pattern {
    public static void main(String[] args) {
        int rows = 5;

        // Loop for printing the top part of the pattern
        for (int i = rows; i > 0; i--) {
            // Print "+" symbols
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            // Print "-" symbols
            for (int j = 0; j < rows - i; j++) {
                System.out.print("-");
            }
            // Move to the next line
            System.out.println();
        }

        // Loop for printing the bottom part of the pattern
        for (int i = 0; i < rows; i++) {
            // Print "-" symbols
            System.out.print("-");
        }
    }
}
