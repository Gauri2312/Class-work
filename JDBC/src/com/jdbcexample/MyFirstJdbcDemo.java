package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class MyFirstJdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		
		//step 3
		Statement stmt=con.createStatement();
		
		//step 4 execute statement
		int a=stmt.executeUpdate("insert into studentdetails values('Anuja',43,'Sangli')");
		
		System.out.println("Successfully added student" +a);
		
		//step 5
		con.close();	
	}
}
