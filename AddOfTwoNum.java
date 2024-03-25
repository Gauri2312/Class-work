package com.oopexample;
import java.util.Scanner;

class User
{
	int a, b, sum;
	Scanner sc = new Scanner(System.in);
	public void additionData()
	{
		System.out.println("Enter first number:");
		a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();  
	}
	public void sum()
	{
		sum = a + b;
		System.out.println("The addition of" +" " +a+ " "+ "and" +" " +b+" " +"is" +" " +sum );
	}
}
public class AddOfTwoNum {

	public static void main(String[] args) {
		User obj = new User();
		obj.additionData();
		obj.sum();
		
	}

}
