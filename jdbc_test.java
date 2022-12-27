package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_test {
	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/soumyadb","root","1234");
	Statement stmt=conn.createStatement();
	
	ResultSet rs=stmt.executeQuery("select * from Employee1");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+
				rs.getString(2)+" "+rs.getString(3));
		
		
	}
	conn.close();
}catch(Exception e) {
	System.out.println(e);
}
	}
}
