//Q1)Create an interface called "BankAccount" with methods called "deposit" and 
//"withdraw". Create a class called "CheckingAccount" that implements the BankAccount 
//interface and implements the "deposit" and "withdraw" methods. Create an object of the 
//CheckingAccount class and call both the "deposit" and "withdraw" methods.
package com.abstraction;

public interface BankAccount {
     public void deposit();
     public void withdraw();
}
