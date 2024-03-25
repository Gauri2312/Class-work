//WAP to accept Employeee id and salary from user and display 3 employees details
package com.oopexample;

import java.util.Scanner;

public class ArrayEmp {

	public static void main(String[] args) {
		int empid[]=new int[3];
		double salary[]=new double[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three employee details: ");
        for(int i=0;i<3;i++)
        {
        	System.out.println("Enter employee id:");
        	empid[i]=sc.nextInt();   	
        	System.out.println("Enter employee salary:");
        	salary[i]=sc.nextDouble();  	
        }
        for(int i=0;i<3;i++)
        {
        	System.out.println("Employee empid: "+empid[i]+" and salary is: "+salary[i]);      	
        }
	}
}
