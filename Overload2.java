package com.oopexample;

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
        }
    }
}

public class Overload2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500);
        account1.deposit(200);
        account1.withdraw(50);
        account1.withdraw(700); 
        
        SavingsAccount account2 = new SavingsAccount(300);
        account2.deposit(100);
        account2.withdraw(50);
        account2.withdraw(200); 
    }
}
