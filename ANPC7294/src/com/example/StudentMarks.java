package com.example;
import java.util.Scanner;
class Student
{
	int physicsMarks;
	int bioMarks;
	int mathsMarks;
	Scanner sc = new Scanner(System.in);
		
	public void showData()
	{
		System.out.println("Enter physics marks: ");
		physicsMarks = sc.nextInt();
		System.out.println("Enter bio marks: ");
		bioMarks = sc.nextInt();
		System.out.println("Enter maths marks: ");
		mathsMarks = sc.nextInt();		  			
	}
	public void display()
	{
		if(bioMarks>85 && mathsMarks>85)
		{
			System.out.println("He has own choice.");
		}
		else if(mathsMarks>85)
		{
			System.out.println("He is engineer student.");
		}
		else if(bioMarks>85)
		{
			System.out.println("He is medical student.");
		}
	}
}
public class StudentMarks {
	public static void main(String args[])
	{
       Student obj = new Student();
       obj.showData();
       obj.display();
	} 
}
