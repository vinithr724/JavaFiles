package org.Assignments.Constructors;

public class Main {
        // Static variable x
        static int x = 5;

        // Static method to get the value of x
        static int getX() {
            return x;
        }

        public static void main(String[] args) {
            // Print the value of static variable x
            System.out.println("Value of static variable: " + x);
            // Print the value of static variable x using the static method getX()
            System.out.println("Value of static variable: " + getX());

            // Create an instance of MyFinalClass
            MyFinalClass obj2 = new MyFinalClass();
            // Call the myFinalMethod() of MyFinalClass
            obj2.myFinalMethod();

            // Create an instance of ChildClass with constructor having two parameters
            ChildClass childObj1 = new ChildClass(10, 20);
            // Print the parent variable and child variable of childObj1
            System.out.println("Parent variable: " + childObj1.parentVar + ", Child variable: " + childObj1.childVar);

            // Create an instance of ChildClass with constructor having one parameter
            ChildClass childObj2 = new ChildClass(30);
            // Print the parent variable (default) and child variable of childObj2
            System.out.println("Parent variable (default): " + childObj2.parentVar + ", Child variable: " + childObj2.childVar);
        }
    }

