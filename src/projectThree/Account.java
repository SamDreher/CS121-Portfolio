package projectThree;

import java.util.ArrayList;

public class Account {
    private static int numberOfAccounts = 1000;
    private double balance;
    private int accountNumber;

    public Account(double initialDeposit) {
        this.balance = initialDeposit;
        this.accountNumber = Account.numberOfAccounts++;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("You have deposited %.2f.\n", amount);
        System.out.printf("You now have a balance of %.2f.\n", balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You have insufficient funds.");
        } else {
            balance -= amount;
            System.out.printf("You have withdrawn %.2f.\nYou now have a balance of %.2f\n", amount, balance);
        }
    }

    @Override
    public String toString() {
        return String.format("Balance: %s\n" + "Account Number: %s\n", balance, accountNumber);
    }



}