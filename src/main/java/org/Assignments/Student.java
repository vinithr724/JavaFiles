package org.Assignments;
public class Student {

    private String name;

    // Constructor to initialize the student's name
    public Student(String name) {
        this.name = name;
    }

    // Concise getter method
    public String getName() {
        return name;  // Return the actual name value
    }

    public static void main(String[] args) {
        Student s = new Student("VinithReddy");  // Set name directly in constructor
        System.out.println(s.getName());
    }
}

// Explaination :
// Class Definition:
//
// public class Student {
// This line declares a class named Student. Classes are used to encapsulate and organize code.
//
// private String name;
// This line declares a private instance variable name of type String.
// The private modifier means that this variable can only be accessed within the Student class.
//
//public Student(String name) {
//    this.name = name;
//}
// This is the constructor of the Student class.
// It takes a parameter name and initializes the name field with the provided value.
// The this keyword is used to refer to the current instance of the class.
//
//public String getName() {
//    return name;
//}
// This is a getter method that allows external classes to retrieve the value of the name field.
// It simply returns the current value of the name field.
//
//Main Method:
//public static void main(String[] args) {
//    Student s = new Student("VinithReddy");
//    System.out.println(s.getName());
//}
// The main method is the entry point of the program.
// It creates an instance of the Student class named s with the name "Vinith".
// It then prints the name by calling the getName method on the s object.

