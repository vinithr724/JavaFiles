package org.Assignments.FunctionalInterface;

public class ChangeCase {

    public static void main(String[] args) {

        String str1 = "Hello World!";
        String newStr = "";

        for (char ch : str1.toCharArray()) {
            newStr += Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
        }

        System.out.println("String after case conversion: " + newStr);
    }
}