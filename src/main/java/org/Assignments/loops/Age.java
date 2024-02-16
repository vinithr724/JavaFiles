package org.Assignments.loops;

public class Age {
    public static void main(String[] args) {
        // Call the AgeCategory method with different ages to determine the age category
        AgeCategory(10);
        AgeCategory(15);
        AgeCategory(25);
    }

    // Method to determine the age category based on the provided age
    public static void AgeCategory(int age) {
        // Check if the age is less than 13
        if (age < 13) {
            // If age is less than 13, print "Kid"
            System.out.println("Kid");
        }
        // If the age is between 13 and 19 (inclusive)
        else if (age >= 13 && age <= 19) {
            // If age is between 13 and 19, print "Teen"
            System.out.println("Teen");
        }
        // If age is greater than 19
        else {
            // If age is greater than 19, print "Adult"
            System.out.println("Adult");
        }
    }
}
