package com.oopexample;

import java.util.Scanner;

class Num
{
	int n;
	Scanner sc = new Scanner(System.in);
	public void table()
	{
		System.out.println("Enter number:");
		n = sc. nextInt();
	}
	public void display()
	{
		for (int i = 1; i <= 10; i++) 
		{
            System.out.println("The table of" +" " + n + " x " + i + " = " + (n * i));
        }
	}
}
public class TableOfNum {

	public static void main(String[] args) {
		Num obj = new Num();
		obj.table();
		obj.display();

	}

}
