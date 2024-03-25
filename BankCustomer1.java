//Constructor overloading 1
//Create Bankcustomer class with acno,atype,amt fields using constructor overloading?
package com.oopexample;

class Account
{
	int acno;
	String atype;
	double amt;
	
	public Account() {
		super();
		this.acno=0;
		this.atype="";
		this.amt=0.0;
	}

	public Account(int acno)
	{
		this.acno=acno;
	}

	public Account(int acno,String atype) {
		super();
		this.acno=acno;
		this.atype=atype;
	}

	public Account(int acno, String atype, double amt) {
		super();
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", atype=" + atype + ", amt=" + amt + "]";
	}	
}
public class BankCustomer1
{
	public static void main(String[] args)
	{
		Account obj=new Account();
		Account obj1=new Account(4356);//constructor gets called automatically when obj is created
		Account obj2=new Account(435,"saving");
		Account obj3=new Account(456,"current",567879.98);
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
        

	
