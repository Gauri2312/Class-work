package com.springhandlingexamples;

import java.util.Scanner;

public class ReplaceToEx {

	public static void main(String[] args) {
		String s1="string";
		String s2="string";
		String s3="swing";
		String place;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of place:");
        place = sc.nextLine();
        
        String newPlace=place.replace("G","o");
        System.out.println("The new String is:"+newPlace);
        
		System.out.println(s1.equals(s2));
		//true because both are equal
		
		System.out.println(s1.equals(s3));
		//false because both are not equal

	}

}
