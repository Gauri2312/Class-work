package com.abstraction;
//interfaces are implemented
public class ICICI implements RBI {

	@Override
	public void debit() {
		System.out.println("ICICI money debit: ");
	}

	@Override
	public void credit() {
		System.out.println("ICICI money credit: ");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("ICICI money transfer: ");
		
	}	
	
	public void homeLoan()
	{
		System.out.println("We also provide homeloan");
	}

}
