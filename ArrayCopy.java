//Write a program in to copy the elements of one array into another array
package com.oopexample;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five values:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();	    
		}
		System.out.println("copied elements to an array B is:");
		for(i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]+"");
		}
	}
}
