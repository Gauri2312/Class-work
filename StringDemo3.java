//WAP to accept a string from user and count number of letters in it also find whether the string is palindrome or not
package com.oopexample;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1,rev="";
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		s1=sc.nextLine();
		len=s1.length();
		System.out.println("length of name:"+len);
		for(int i=len-1;i>=0;i--)
		{
	       rev=rev+s1.charAt(i);
		}
	       if(s1.equals(rev))
	       {
	    	   System.out.println("string is palindrome");
	       }
	       else
	       {
	    	   System.out.println("string is not palindrome");
	       }
		

	}

}
