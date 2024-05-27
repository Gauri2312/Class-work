//multiple catch
package com.exceptionhandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try
		{
		int a[]=new int[5]; //a[0],a[1],a[2],a[3],a[4]
		int c;
		c=100/0;
		a[5]=23;
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("You can divide by zero");
		}

	}

}
