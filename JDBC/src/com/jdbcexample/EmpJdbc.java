//WAP to add data in EMPDB having table as empdata(empid,empname,salary,designation)
//insert a record from java
package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class EmpJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
		
		//step 3
		Statement stmt=con.createStatement();
		
		//step 4 execute statement
		int e=stmt.executeUpdate("insert into empdata values(10,'Prachi',52000.0,'Front end Developer')");
		
		System.out.println("Successfully added employee" +e);
		
		//step 5
		con.close();	
	}
}
