package Threads1_opg5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// NOT THREADSAFE
public class BankAccountUnsynchronized {

    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccountUnsynchronized() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;       
    }

    public double getBalance() {
        return balance;
    }
}

// Opgave 5.1
// Løses ved at indsætte synchronized i withdraw og deposit metoderne

// Opgave 5.2
// Løses ved at lave locks magen til opgave 4
// public void deposit(double amount) {
//        lock.lock();
//        try {
//        balance += amount;
//        } finally {
//            lock.unlock();
//        }
//    }