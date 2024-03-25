//wap to accept details from employee and print the same details.
package com.oopexample;

import java.util.Scanner;

class Employee1
{
	int eid;
	String name;
	double salary;
	Scanner sc= new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter your EmpID:");
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your salary:");
		salary=sc.nextDouble();
		
	}
	
	public void display()
	{
		System.out.println("Welcome to TCS Career site \nyour employee id is: "+eid+"\nyour name is: "+name+"\nyour salary is: "+salary);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.accept();
		emp.display();

	}

}
