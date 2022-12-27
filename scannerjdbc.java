package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class scannerjdbc {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("id:");
String id=sc.next();
System.out.println("sname:");
String sname=sc.next();
System.out.println("sage:");
String sage=sc.next();
System.out.println("Phoneno:");
String sphone=sc.next();
System.out.println("semail:");
String semail=sc.next();
System.out.println("sadd:");
String sadd=sc.next();
System.out.println("squalification");
String squalification=sc.next();
System.out.println("fees:");
String fees=sc.next();
try {
	//register driver step no 1
	Class.forName("com.mysql.cj.jdbc.Driver");
	//get connection step 2
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/misbahdb","root","root3119");
	//creating statement
	PreparedStatement stm;
	//inserting data in database table 
	String sql="insert into Student_details values (?,?,?,?,?,?,?,?)";
	stm=conn.prepareStatement(sql);
	stm.setString(1, id);
	stm.setString(2,sname);
	stm.setString(3,sage);
	stm.setString(4,sphone);
	stm.setString(5, semail);
	stm.setString(6, sadd);
	stm.setString(7, squalification);
	stm.setString(8, fees);
	stm.execute();
	System.out.println("Insert done");
}catch(Exception e) {
	System.out.println(e);
}


	}

}