package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert_jdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/soumyadb","root","1234");
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("insert into Student_join values(10,'Bishnupriya',\"Sethi\",23,'Mumbai',\"a0\")");
			System.out.println("inserted successfully");
			conn.close();
			}
			catch(Exception e) {
			System.out.println(e);
		}
			}
}
