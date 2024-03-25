package com.oopexample;

import java.util.Scanner;
public class LoanOfPerson {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int sal = sc. nextInt();
        System.out.println("Enter your age:");
        int age = sc. nextInt();

        if(sal>35000 && age>18)
        {
            System.out.println("You are eligible for loan.");
        }
        else
        {
            System.out.println("You are not eligible for loan.");
        }

	}

}
