package com.exceptionhandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {	
		try
		{
		int a,b,c;
		c=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("You can't divide by 0");
		}
		finally
		{
			System.out.println("this is compulsory executable block");
		}
	}
}
