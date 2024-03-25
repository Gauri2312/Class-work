//Write a program to array elements print all Positive number
package com.oopexample;

import java.util.Scanner;

public class ArrayPositiveNum {

	public static void main(String[] args) {
		int i;
		int n[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		
		for(i=0;i<5;i++) 
		{
			n[i] = sc.nextInt();  
		}
		 System.out.println("Positive numbers:");
		 for(i=0;i<5;i++)
		 {
			 if(n[i]>0)
			 {
				 System.out.println(n[i]);
			 }
		 }
	}

}
