package org.Assignments.FunctionalInterface;


public class RotationString {

    public static boolean isRotation(String str1, String str2) {

        // Handle null or empty strings
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Check if lengths are equal (non-rotations must have different lengths)
        if (str1.length() != str2.length()) {
            return false;
        }

        // Combine both strings in a circular fashion
        String combined = str2 + str2;

        // Check if the first string is a substring of the combined string
        return combined.contains(str1);
    }
}
    /*public static void main(String[] args) {

        String str1 = "avajava";
        String str2 = "javaava";

        boolean isRotation = isRotation(str1, str2);

        if (isRotation) {
            System.out.println("Yes, the second string is a rotation of the first string.");
        } else {
            System.out.println("No, the second string is not a rotation of the first string.");
        }
    }
}*/