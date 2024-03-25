package com.abstraction;

public class HDFC implements RBI{

	@Override
	public void debit() {
		System.out.println("HDFC money debit: ");
		
	}

	@Override
	public void credit() {
		System.out.println("HDFC money credit: ");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("HDFC money trasfer: ");
		
	}
	
	
}
