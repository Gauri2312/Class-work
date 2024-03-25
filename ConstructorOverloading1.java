
//Create Bankcustomer class with acno,atype,amt fields using constructor overloading?
package com.oopexample;

class BankCustomer
{
    private int acno; 
    private String atype;
    private double amt;
    
    // Constructor with all fields
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }
    
    // Constructor without amount field
    public BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0; 
    }
    
    // Getters and setters
    public int getAcno() {
        return acno;
    }

    public void setAcno(int acno) {
        this.acno = acno;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

}
public class ConstructorOverloading1 {

	public static void main(String[] args) {
		BankCustomer customer1 = new BankCustomer(123456, "Savings", 1000.0);
        System.out.println("Account Number: " + customer1.getAcno());
        System.out.println("Account Type: " + customer1.getAtype());
        System.out.println("Amount: " + customer1.getAmt());
        
        BankCustomer customer2 = new BankCustomer(654321, "Current");
        System.out.println("\nAccount Number: " + customer2.getAcno());
        System.out.println("Account Type: " + customer2.getAtype());
        System.out.println("Amount: " + customer2.getAmt());

	}

}
