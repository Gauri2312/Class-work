//wap to view data from sql table
package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySecondJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 1
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb","root","root");
        //step 3
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from customer");
		int sal;
		String id, name,desig,dept;
		System.out.println("Employee details");
		System.out.println("================");
		while(rs.next())
		{
			id=rs.getString(1);
			name=rs.getString(2);
			desig=rs.getString(3);
			dept=rs.getString(4);
			sal=rs.getInt(5);
			System.out.println(id+" | "+name+" | "+desig+" | "+dept+" | "+sal);
		}
		con.close();
	}

}
