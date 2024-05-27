package com.methodoverloading;

public class OverloadingDemo {

	public void add(int a,int b) {
		int c=a+b;
		System.out.println("the addition is "+c);

	}
	public void add(int a,int b,double c)
	{
		double d=a+b+c;
		System.out.println("the addition is "+d);
	}
	public static void main(String[] args)
	{
		OverloadingDemo obj=new OverloadingDemo();
		obj.add(23, 67);
		obj.add(45, 50, 5.5);
	}
}
