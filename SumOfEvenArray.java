//Write a program to array elements to print sum of Even Numbers
package com.oopexample;

import java.util.Scanner;

public class SumOfEvenArray {

	public static void main(String[] args) {
		int i,sum=0;
		int n[] = new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		for(i=0;i<5;i++) 
		{
			n[i] = sc.nextInt();  
		}
		 System.out.println("Even numbers:");
		 for(i=0;i<5;i++)
		 {
			 if(n[i]%2==0)
			 {
				 System.out.println(n[i]);
			 }
		 }
		
		
        

	}

}
