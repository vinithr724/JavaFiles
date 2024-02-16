package org.Assignments.ObjectArray.Person;

public class PersonEqualsExample {
    // Main method for testing

    public static void main(String[] args) {
        // Create two Person objects with the same SSN
        Person person1 = new Person(170.0, 70.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(180.0, 80.0, "123-45-6789", "987-654-3210");

        // Check if person1 equals person2
        System.out.println("Do person1 and person2 have the same SSN? " + person1.equals(person2));
    }
}
