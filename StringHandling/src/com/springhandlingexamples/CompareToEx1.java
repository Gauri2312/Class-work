package com.springhandlingexamples;

import java.util.Scanner;

public class CompareToEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1=sc.nextLine();
		
		System.out.println("Enter second string:");
		String s2=sc.nextLine();
		
		System.out.println("Enter third string:");
		String s3=sc.nextLine();
		
		System.out.println("Enter fourth string:");
		String s4=sc.nextLine();
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.compareTo(s4));
		
	}

}
