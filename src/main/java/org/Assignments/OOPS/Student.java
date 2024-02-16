package org.Assignments.OOPS;

// Assuming Product and Car classes are defined elsewhere
public class Student {
    private String name;  // Encapsulate the name field

    public String getName() {
        return name;
    }

    public void setName(String name) {  // Add a setter for name
        this.name = name;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Vinith");  // Use the setter to set the name
        String myName = obj.getName();
        System.out.println(myName);  // Output: Vinith

        // Assuming Product and Car classes have a printType() method
        Product p = new Product() {
            @Override
            public void printType() {

            }
        };
        p.printType();

        Car c = new Car();
        c.printType();
    }
}