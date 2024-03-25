package com.oopexample;

import java.util.Scanner;
class TeacherDemo
{
	int tid;
	String tname;
	double salary;
	Scanner sc= new Scanner(System.in);
	public void getTeacherData()
	{
		System.out.println("Teacher ID: ");
		tid = sc.nextInt();
		sc.nextLine();
        System.out.println("Teacher Name: ");
        tname = sc.nextLine();
        System.out.println("Salary: " );
        salary = sc.nextDouble();
	}
}
class HRADemo extends TeacherDemo
{
	double salaryHRA=0;
	public void addHRA()
	{
		salaryHRA = salary + (0.12 * salary);
		System.out.println("After adding HRA salary: " +salaryHRA);
	}
}

public class ScienceTeacher extends HRADemo {

	int bonus = 5000;
	double finalSal;
	public void finalSal()
	{
	 finalSal = salaryHRA + bonus;
	 System.out.println("total salary: " +finalSal);
	}
	public static void main(String[] args) {
		ScienceTeacher obj = new ScienceTeacher();
		 obj.getTeacherData();
		 obj.addHRA();
		 obj.finalSal();
	}

}
