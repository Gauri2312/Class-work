package com.oopexample;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int num[] = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		for(i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}

	}

}
