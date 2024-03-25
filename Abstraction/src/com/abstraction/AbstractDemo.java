package com.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		ICICI obj=new ICICI();
		obj.credit();
		obj.debit();
		obj.moneyTransfer();
		obj.homeLoan();
		
		HDFC obj1=new HDFC();
		obj1.credit();
		obj1.debit();
		obj1.moneyTransfer();
	}

}
