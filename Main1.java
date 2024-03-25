package com.oopexample;

import java.util.Scanner;

//Parent class
class Teacher {
 protected int tid;
 protected String tname;
 protected double salary;

 // Constructor
 Teacher(int tid, String tname, double salary) {
     this.tid = tid;
     this.tname = tname;
     this.salary = salary;
 }

 // Method to display teacher details
 void displayDetails() {
     System.out.println("Teacher ID: " + tid);
     System.out.println("Teacher Name: " + tname);
     System.out.println("Base Salary: $" + salary);
 }
}

//Child class inheriting Teacher
class Science extends Teacher {
 Science(int tid, String tname, double salary) {
     super(tid, tname, salary);
 }

 // Method to add bonus for science teacher
 void addBonus() {
     salary += 5000;
 }
}

//Grandchild class inheriting Science
class HRA extends Science {
 HRA(int tid, String tname, double salary) {
     super(tid, tname, salary);
 }

 // Method to add HRA
 void addHRA() {
     salary += (0.12 * salary); // Adding 12% of salary as HRA
 }

 // Method to display final salary including bonus and HRA
 void displayFinalSalary() {
     addBonus(); // Add bonus
     addHRA(); // Add HRA
     System.out.println("Final Salary (including Bonus and HRA): $" + salary);
 }
}

public class Main1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Accept teacher details
     System.out.println("Enter Teacher ID:");
     int tid = scanner.nextInt();
     scanner.nextLine(); // Consume newline
     System.out.println("Enter Teacher Name:");
     String tname = scanner.nextLine();
     System.out.println("Enter Base Salary:");
     double salary = scanner.nextDouble();

     // Create object of HRA class
     HRA teacher = new HRA(tid, tname, salary);

     // Display teacher details
     System.out.println("\nTeacher Details:");
     teacher.displayDetails();

     // Display final salary including bonus and HRA
     System.out.println("\nFinal Salary:");
     teacher.displayFinalSalary();
 }
}
