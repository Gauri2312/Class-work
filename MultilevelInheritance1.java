package com.oopexample;

import java.util.Scanner;
class Shape
{
	double r,h;
	double pi=3.14;
	Scanner sc= new Scanner(System.in);
	public void getRadius()
	{
		System.out.println("Enter radius:");
		r = sc.nextDouble();
		System.out.println("Enter height:");
		h = sc.nextDouble();
	}
}
class Circle extends Shape
{
	public void calculateArea() {
	double a = 3.14 * r * r;
	System.out.println("Area of circle :" +a);
	
    }
}
class Cylinder extends Circle
{
    public void calculateVolume() {
	double v = 3.14 * r * 2 * h;
	System.out.println("Volume of cylinder :" +v);
	
    }
}

public class MultilevelInheritance1 {

	public static void main(String[] args) {
		Cylinder obj = new Cylinder();
		obj.getRadius();
		obj.calculateArea();
		obj.calculateVolume();
	}
}
