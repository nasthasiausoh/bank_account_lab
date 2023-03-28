package org.example;

public class BankAccount {

// Creating our properties:
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;

//    Creating our constructor
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = 0;
        this.balance = 0;
    }


//    Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }

//    Setters

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setDateOfBirth(String newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public double setBalance(double newBalance) {
        this.balance = newBalance;
        return newBalance;
    }


}


