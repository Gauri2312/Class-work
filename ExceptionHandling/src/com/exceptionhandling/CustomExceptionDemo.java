//WAP to create exception to check age less than zero or not
package com.exceptionhandling;

public class CustomExceptionDemo {

	public static void main(String[] args) throws AgelessThanZeroException 
	{
       check(-5);

	}
	public static void check(int age) throws AgelessThanZeroException 
	{
		if(age<0)
		{
			throw new AgelessThanZeroException("Ohh something went wrong!!");
		}
	}
}
