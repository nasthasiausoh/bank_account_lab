package org.example;

public class Deposit {

// Creating our methods
//    Deposit method - taking in an amount and updating the BankAccount balance

    public double updatedBalance(double balance, double depositAdded) {

        if (depositAdded > 0) { return balance += depositAdded;
        }
        return balance;
    }
}
