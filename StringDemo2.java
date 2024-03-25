package com.oopexample;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		String str,str1,str2,str3,Res;
		int len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your fav movie name: ");
		str=sc.nextLine();
		len=str.length();
		System.out.println("The length of string is: "+len);
		System.out.println("MOVIE IN CAPITAL LETTER");
        str1=str.toUpperCase();
        System.out.println(str1);
        //sc.nextLine();
        System.out.println("Enter name of hero in capital letter");
        str2=sc.next();
        str3=str2.toLowerCase();
        System.out.println(str3);
        Res=str1.concat(str3);
        System.out.println("The concatination of two string is "+Res);
	}

}
