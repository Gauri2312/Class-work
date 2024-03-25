//Write a program to enter a letter.Change the case of the input letter
//and display the case of input letter and its ASCII code.
//Sample input:b
//Sample output:B
//The ascii value is B:66

package com.oopexample;

import java.util.Scanner;

public class Alphabate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char chr,chr1;
		System.out.println("Enter a character:");
		chr=sc.next().charAt(0);
        if(Character.isUpperCase(chr)==true)
        {
        	chr1=Character.toLowerCase(chr);
        	System.out.println("lower case of "+chr+" is "+chr1);
        	System.out.println("The ASCII value is:"+(int)chr1);	
        }
        else
        {
        	chr1=Character.toUpperCase(chr);
        	System.out.println("Upper case of "+chr+" is "+chr1);
        	System.out.println("The ASCII value is:"+(int)chr1);
        }
	}

}
