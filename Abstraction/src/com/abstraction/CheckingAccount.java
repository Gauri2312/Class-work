package com.abstraction;

public class CheckingAccount implements BankAccount{
	@Override
	public void deposit() {
		System.out.println("Money Deposited");		
	}

	@Override
	public void withdraw() {
	            System.out.println("Money Withdrawn");
	}
}
