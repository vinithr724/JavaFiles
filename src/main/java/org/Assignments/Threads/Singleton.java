package org.Assignments.Threads;

// Singleton class, ensuring only one instance can exist
public class Singleton {

    // Private static variable to hold the single instance
    private static Singleton instance = null; // Initially null

    // Public String variable accessible to users
    public String str;

    // Private constructor to prevent external instantiation
    private Singleton() {
        str = "It is an example of a singleton class.";
    }

    // Public static method to get the single instance
    public static synchronized Singleton getInstance() {
        // Double-check locking for thread safety and efficiency
        if (instance == null) { // Check if instance already exists
            synchronized (Singleton.class) { // Synchronize for thread safety
                if (instance == null) { // Double-check inside synchronized block
                    instance = new Singleton(); // Create the instance if still null
                }
            }
        }
        return instance; // Return the single instance
    }
}
