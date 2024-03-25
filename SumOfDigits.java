package com.oopexample;

import java.util.Scanner;
class Addition
{
	int n,sum;
	Scanner sc = new Scanner(System.in);
	public void getNum() {
		System.out.println("Enter number:");
		n = sc.nextInt();
			
	}
	public void display()
	{
		while (n!= 0) 
		{
            sum += n% 10;
            n /= 10;
         }
		System.out.println("Sum of digits: " + sum);
}
}
public class SumOfDigits {

	public static void main(String[] args) {
		Addition obj = new Addition(); 
		obj.getNum();
		obj.display();

	}

}
