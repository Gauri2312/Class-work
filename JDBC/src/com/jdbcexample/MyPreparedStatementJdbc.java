package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyPreparedStatementJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","root");
		
		PreparedStatement pstmt=con.prepareStatement("Insert into customer values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		String id=sc.next();
		
		System.out.println("Enter employee name: ");
		String name=sc.next();
		
		System.out.println("Enter employee designation: ");
		String desig=sc.next();
		
		System.out.println("Enter employee department: ");
		String dept=sc.next();
		
		System.out.println("Enter employee salary: ");
		int sal=sc.nextInt();

		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		int r=pstmt.executeUpdate();
		con.close();
		System.out.println("Successfully added employee" +r);
	}

}
