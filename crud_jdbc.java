package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class crud_jdbc {
		public static void main(String[] args) {
			try {
				//register driver step no 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection step no 2
			Connection conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/soumyadb","root","1234");
			//CREATE
			//create statement step no 3
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("insert into Department values (6,\"Computer Science\",20)");
			System.out.println("inserted successfully");
			//READ
			//read statement step no 4
			Statement stmt2=conn.createStatement();
			ResultSet rs=stmt2.executeQuery("select * from Department");
			//UPDATE
			//update statement step no 5
			Statement stmt3=conn.createStatement();
			stmt3.executeUpdate("Update Department set Department_Name='cse'  where id=4"); 
			//DELETE record
			Statement stmt4=conn.createStatement();
			stmt4.executeUpdate("delete from Department where id=5 ");
			 rs=stmt.executeQuery("select * from Department");
			
			//Iteration
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
			}
			//close database connection step no 6
			conn.close();
	} catch(Exception e)  {
		System.out.println(e);
	}
	}
}
