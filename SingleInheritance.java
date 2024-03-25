package com.oopexample;

import java.util.Scanner;
class Add1
{
	int a,b,sum;
	Scanner sc=new Scanner(System.in);
	public void inputNum()
	{
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
class Result extends Add1
{
	public void display() {
		sum=a+b;
		System.out.println("This sum is "+sum);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Result obj=new Result();
		obj.inputNum();
		obj.display();

	}

}
