package com.oopexample;

import java.util.Scanner;

class Average
{
	int a,b,c, avg;
	Scanner sc=new Scanner(System.in);
	
	public void threeNum()
	{
		System.out.println("Enter first number:");
		a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();  
		System.out.println("Enter third number:");
		c = sc.nextInt();	  
	}
	
	public void averageOfThree()
	{
		avg = (a + b + c) /3;
		System.out.println("The average of"+" "+a+ " ,"+b+ " " + "and" + " " +c+ " " + "is:" +" "+ avg);
	}
}
public class AvgOfThreeNum {

	public static void main(String[] args) {
		Average obj = new Average();
		obj.threeNum();
		obj.averageOfThree();

	}

}
