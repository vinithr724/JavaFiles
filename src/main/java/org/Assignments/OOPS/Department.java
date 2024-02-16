package org.Assignments.OOPS;

public abstract class Department {
    abstract int getDepartmentSize();
}

class DepartmentOfCivil extends Department {
    int sizeOfDepartment;
    public int getDepartmentSize(){
        return sizeOfDepartment;
    }
}