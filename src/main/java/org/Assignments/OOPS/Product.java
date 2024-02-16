package org.Assignments.OOPS;

public abstract class Product {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public double calculateTotalPrice(int quantity) {
        return quantity * price;
    }

    public abstract void printType();
}

class Car extends Product {

    @Override
    public void printType() {
        System.out.println("This is a Car");
    }
}
