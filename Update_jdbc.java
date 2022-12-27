package com.jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_jdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/soumyadb","root","1234");
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("update  employee1 set last_name='raj' where EMPLOYEE_ID=198");
			stmt.executeUpdate("delete from employee1  where EMPLOYEE_ID=200");
			ResultSet rs=stmt.executeQuery("Select * from employee1");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+
						rs.getString(2)+" "+rs.getString(3));
				
				
			}
}catch(Exception e) {
	System.out.println(e);
}
	}
}
