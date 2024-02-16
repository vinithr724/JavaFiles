package org.Assignments.Constructors;

class ParentClass {
    // Declare parentVar variable
    int parentVar;

    // Constructor with one parameter
    ParentClass(int parentVar) {
        this.parentVar = parentVar;
    }
}

class ChildClass extends ParentClass {
    // Declare childVar variable
    int childVar;

    // Constructor with two parameters
    ChildClass(int parentVar, int childVar) {
        // Call superclass constructor with the specified parentVar
        super(parentVar);
        // Initialize childVar
        this.childVar = childVar;
    }

    // Constructor with one parameter
    ChildClass(int childVar) {
        // Call superclass constructor with a default value for parentVar
        super(0);
        // Initialize childVar
        this.childVar = childVar;
    }
}
