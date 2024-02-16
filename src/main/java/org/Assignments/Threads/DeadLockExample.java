package org.Assignments.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
    // Define two locks using ReentrantLock
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        // Define and start two threads
        Thread thread1 = new Thread(() -> {
            // Acquire locks in a predefined order
            acquireLocks(lock1, lock2);
            try {
                // Execute code while holding the locks
                System.out.println("Thread 1: Acquired resource1");
                // Simulate work
                Thread.sleep(100);
                System.out.println("Thread 1: Waiting for resource2...");
                // Acquire locks in the opposite order to create potential deadlock
                acquireLocks(lock2, lock1);
                System.out.println("Thread 1: Acquired resource2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Release locks when done
                releaseLocks(lock1, lock2);
            }
        });

        Thread thread2 = new Thread(() -> {
            // Similar logic as thread1
            acquireLocks(lock2, lock1);
            try {
                System.out.println("Thread 2: Acquired resource2");
                Thread.sleep(100);
                System.out.println("Thread 2: Waiting for resource1...");
                acquireLocks(lock1, lock2);
                System.out.println("Thread 2: Acquired resource1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                releaseLocks(lock1, lock2);
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }

    // Method to acquire locks in a predefined order
    private static void acquireLocks(Lock firstLock, Lock secondLock) {
        while (true) {
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;
            try {
                // Attempt to acquire both locks
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            } finally {
                // If both locks are acquired, return
                if (gotFirstLock && gotSecondLock) {
                    return;
                }
                // If only one lock is acquired, release it and retry
                if (gotFirstLock) {
                    firstLock.unlock();
                }
                if (gotSecondLock) {
                    secondLock.unlock();
                }
            }
            // To avoid CPU intensive spinning, sleep for a short duration
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to release locks
    private static void releaseLocks(Lock lock1, Lock lock2) {
        lock1.unlock();
        lock2.unlock();
    }
}
