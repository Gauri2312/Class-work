package com.example;
import java.util.Scanner;
class Person
{
	double grossSal;
	Scanner sc = new Scanner(System.in);
	public void getInfo() {
		System.out.println("Enter annual gross salary:");
		grossSal=sc.nextDouble();
			
	}
	public void displayInfo() {
		double pTax;
		if (grossSal <= 100000) {
           pTax= 0;
        } else if (grossSal <= 500000) 
        {
           pTax=10000 + 10/100 * (grossSal - 100000);
        } else if (grossSal <= 800000) 
        {
           pTax=50000 + 20/100 * (grossSal - 500000);
        } else 
        {
           pTax=10000 + 30/100 * (grossSal - 800000);
        }
		System.out.println("Tax payable: Rs. " + pTax);
		pTax=sc.nextDouble();
	}
}

public class TaxPayableByPerson {

	public static void main(String[] args) {
		Person obj= new Person();
		obj.getInfo();
		obj.displayInfo();
	}

}
