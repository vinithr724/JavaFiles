package org.Assignments.ObjectArray.Person;

import java.util.Objects;

class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    // Constructor
    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Override equals method to match persons based on ssn
    @Override
    public boolean equals(Object obj) {
        // Check if the compared object is the same as this instance
        if (this == obj) {
            return true;
        }
        // Check if the compared object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Cast the compared object to Person
        Person person = (Person) obj;
        // Check if the SSNs are equal
        return Objects.equals(ssn, person.ssn);
    }

    // Override hashCode for consistency with equals
    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }


    }
