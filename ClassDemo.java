package com.oopexample;

import java.util.Scanner;
class Employee   //starting letter of class should be capital
{
	//declaration of data member
	int empId=102;
	String empName;
	double basicSal;
	Scanner sc = new Scanner(System.in);
	public void getInfo()   // methods are written in cameCase
	{
		System.out.println("Enter EmpId and Name:");
	    empId = sc.nextInt();
	    sc.nextLine();
	    empName = sc.nextLine();
	    System.out.println("Enter your basic salary:");
	    basicSal=sc.nextDouble();
	}
	public void showInfo()
	{
		System.out.println("Verify your information:");
		System.out.println("Your empid:"+empId);
		System.out.println("Your empName: "+empName);
		System.out.println("Your Basic Salary:"+basicSal);
		
		
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		Employee obj= new Employee();
		System.out.println("Information of empid"+obj.empId);
		obj.getInfo();
		obj.showInfo();
	}

}
