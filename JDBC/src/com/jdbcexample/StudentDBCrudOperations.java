/*Create Crude operation for students details accepting the  input from user for confirming the operations
1.Enter the student details, 
2.Retrieve the students details,
3.delete the students details, 
4.edit the students details.*/

package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDBCrudOperations {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Step 1
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		// Step 2
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1", "root", "root");

        // Step 3
        Statement stmt = connection.createStatement();

        Scanner sc = new Scanner(System.in);
        
        int operation;

        do 
        {
            System.out.println("Available Operations:");
            System.out.println("1. Create");
            System.out.println("2. Retrive");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            
            System.out.print("Please Enter a Operation number you want to Perform: ");
            operation = sc.nextInt();
            
            sc.nextLine(); 
            switch (operation) 
            {
            case 1:
                    System.out.print("Enter student first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter student last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter student grade: ");
                    String grade = sc.nextLine();

                    String createSql = "INSERT INTO students (first_name, last_name, age, grade) VALUES (?, ?, ?, ?)";
                    
                    try (PreparedStatement createStatement = connection.prepareStatement(createSql)) 
                    {
                    	createStatement.setString(1, firstName);
                    	
                        createStatement.setString(2, lastName);
                       
                        createStatement.setInt(3, age);
                        
                        createStatement.setString(4, grade);
                        
                        int rowsAffected = createStatement.executeUpdate();
                     
                        if (rowsAffected > 0) 
                        {
                            System.out.println("Student added successfully.");
                        } else 
                        {
                            System.out.println("Failed to add student.");
                        }
                    }
                    break;

                case 2:
                    String readSql = "SELECT * FROM students";
                   
                    try (Statement readStatement = connection.createStatement()) 
                    {
                        ResultSet resultSet = readStatement.executeQuery(readSql);

                        while (resultSet.next()) 
                        {
                            int studentId = resultSet.getInt("student_id");
                            String studentFirstName = resultSet.getString("first_name");
                            String studentLastName = resultSet.getString("last_name");
                            int studentAge = resultSet.getInt("age");
                            String studentGrade = resultSet.getString("grade");
                            
                            System.out.println(
                                    "ID: " + studentId + ", Name: " + studentFirstName + " " + studentLastName + ", Age: " + studentAge + ", Grade: " + studentGrade);
                        }
                    }
                    break;

                case 3:
               
                    System.out.print("Enter student ID to update: ");
                    int studentIdToUpdate = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println("Choose what to update:");
                    System.out.println("1. Update name");
                    System.out.println("2. Update age");
                    System.out.println("3. Update grade");
                    
                    System.out.print("Enter your choice: ");
                    int updateChoice = sc.nextInt();
                    sc.nextLine(); 

                    String updateSql;
                    PreparedStatement updateStatement;
                    
                    switch (updateChoice) 
                    {
                        case 1:
                            System.out.print("Enter new first name: ");
                            String newFirstName = sc.nextLine();
                            System.out.print("Enter new last name: ");
                            String newLastName = sc.nextLine();

                            updateSql = "UPDATE students SET first_name = ?, last_name = ? WHERE student_id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newFirstName);
                            updateStatement.setString(2, newLastName);
                            break;

                        case 2:
                            System.out.print("Enter new age: ");
                            int newAge = sc.nextInt();
                            
                            updateSql = "UPDATE students SET age = ? WHERE student_id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setInt(1, newAge);
                            break;

                        case 3:
                            sc.nextLine(); 
                            System.out.print("Enter new grade: ");
                            String newGrade = sc.nextLine();

                            updateSql = "UPDATE students SET grade = ? WHERE student_id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newGrade);
                            break;

                        default:
                            System.out.println("Invalid choice for update. Please try again.");
                            continue; 
                    }

                    updateStatement.setInt(2, studentIdToUpdate);
                    int rowsAffected = updateStatement.executeUpdate();
                    
                    if (rowsAffected > 0) 
                    {
                        System.out.println("Student updated successfully.");
                    } else 
                    {
                        System.out.println("Student not found or update failed.");
                    }
                    break;

                case 4:
                	System.out.print("Enter student ID to delete: ");
                    int studentIdToDelete = sc.nextInt();

                    String deleteSql = "DELETE FROM students WHERE student_id = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) 
                    {
                        deleteStatement.setInt(1, studentIdToDelete);
                        int rowsAffected1 = deleteStatement.executeUpdate();
                        if (rowsAffected1 > 0) 
                        {
                            System.out.println("Student deleted successfully.");
                        } else 
                        {
                            System.out.println("Student not found or delete failed.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        
        while (operation != 5);

        sc.close();
       
        stmt.close();
        
        connection.close();
    }
}


