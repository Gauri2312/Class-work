package com.oopexample;

import java.util.Scanner;
class One
{
	int a,b,c;
	Scanner sc= new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
}
class Second extends One
{
	double avg;
	public void calc()
	{
		avg=(a+b+c)/3.0;
	}
}
class Third extends Second
{
	public void display()
	{
		System.out.println("The average of three numbers are:"+avg);
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
		Third obj = new Third();
		obj.accept();
		obj.calc();
		obj.display();
	}

}
