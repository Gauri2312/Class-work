package com.springhandlingexamples;

import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		//using character array
		char[] helloArray= {'h','e','l','l','o'};
		String helloString=new String(helloArray);
		System.out.println(helloString);
        
		//using string variables
		String myName="Sangeeta";
		System.out.println(myName);
		
		//using String class object
		String schoolName =new String("Sameera");
		System.out.println(schoolName);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your country:");
		String country = sc.nextLine(); 
		System.out.println("you have entered"+country);
		
	}

}
