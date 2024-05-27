package com.springhandlingexamples;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		String myName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
        myName=sc.nextLine();
        //Find character at specific position
        
        char c=myName.charAt(2);
        System.out.println("The character at index 2 is: "+c);
        
        //Find index of specified character
        
        int index=myName.indexOf('a');
        System.out.println("Index of specified character is:"+index);
        
        
	}

}
