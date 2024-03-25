package com.oopexample;

import java.util.Scanner;

class Car1
{
	String brand;
	String color;
	int year;
	Scanner sc=new Scanner(System.in);
	public void inputCar(){
		System.out.println("Car Details are given below:");
		System.out.println("Enter car brand name:");
		brand = sc.nextLine();
		System.out.println("Enter car color:");
		color = sc.nextLine();
		System.out.println("Enter manufacture year of car:");
		year = sc.nextInt();	
	}
}
class Details extends Car1
{
	public void display()
	{
		System.out.println("This is car details of " +brand+ "\n" + "It has color " +color+ " and manufacture year is " +year);
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Details obj=new Details();
		obj.inputCar();
		obj.display();

	}

}
