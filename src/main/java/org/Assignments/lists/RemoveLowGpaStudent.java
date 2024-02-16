package org.Assignments.lists;

import java.util.ArrayList;

public class RemoveLowGpaStudent {

    public static void main(String[] args) {
        // Sample student data
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Johnson", 3.8));
        students.add(new Student("Bob", "Smith", 3.5));
        students.add(new Student("Charlie", "Brown", 2.9));
        students.add(new Student("David", "Lee", 3.7));
        students.add(new Student("Emily", "Williams", 4.0));

        // Calculate average GPA
        double totalGpa = 0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / students.size();

        // Remove students with GPA below average
        students.removeIf(student -> student.getGpa() < averageGpa);

        // Print remaining students
        System.out.println("Students with GPA above average:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
