package com.example;

public class Calculator {
	//method to add two integers
			public int add(int a,int b)
			{
				return a + b;
			}
			//overload method to add three integers
			public int add(int a,int b,int c)
			{
				return a + b + c;
			}
			//overload method to add two doubles
			public double add(double a,double b)
			{
				return a + b;
			}
			//overload method to add three doubles
			public double add(double a,double b, double c)
			{
				return a + b + c;
			}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		//adding two integers
		int sum1 = calculator.add(5, 10);
		System.out.println(sum1); //output:15
		//adding three integers
		int sum2 = calculator.add(5, 10, 15);
		System.out.println(sum2); //output:30
		//adding two doubles
		double sum3 = calculator.add(5.5, 10.5);
		System.out.println(sum3); //output:16.0
		//adding three doubles
		double sum4 = calculator.add(5.5, 10.5, 15.5);
		System.out.println(sum4); //output:31.5
	}

}
