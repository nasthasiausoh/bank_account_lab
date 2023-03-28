package org.example;

public class Withdrawal {
    // Creating our methods
//    Withdrawal method - taking out an amount and updating the BankAccount balance

    public int updatedBalance(int balance, int depositAdded) {

        if (depositAdded > 0) { return balance -= depositAdded;
        }
        return balance;
    }
}


