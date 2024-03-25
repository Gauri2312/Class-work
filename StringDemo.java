package com.oopexample;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String s1,s2,desig;
		char g;
		s1="Gauri"; //string literal
		System.out.println("First string is "+s1);
        s2=new String("Lakade");
        System.out.println("Second string is "+s2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your designation: ");
        desig=sc.next();
        System.out.println("Confirm your designation "+desig);
        sc.nextLine();
        System.out.println("Enter your gender: ");
        g=sc.next().charAt(0);
        System.out.println("Your gender is "+g);
	}

}
