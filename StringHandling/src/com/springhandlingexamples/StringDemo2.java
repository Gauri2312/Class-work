package com.springhandlingexamples;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		String fname,sname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name:");
		fname=sc.nextLine();
		
		int l=fname.length();
		System.out.println("The length of your name is:"+l);
		
		System.out.println("Enter your last name:");
		sname=sc.nextLine();
		
		String str=fname.concat(sname);
		int flen=str.length();
		System.out.println("your full name is:"+str);
		System.out.println("final length is:"+flen);
	}

}
