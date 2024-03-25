package com.myexamples;

class Employee
{
	int empid;
	String ename;
	double sal;
	Employee(int i,String n, double s)
	{
		empid = i;
		ename = n;
		sal = s;
	}
	public void display()
	{
		System.out.println("The employee id is " +empid+ ", Name is " +ename+ " and salary is " +sal);	
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		Employee obj = new Employee(1,"Gauri",25000);
        obj.display();
	}
}
