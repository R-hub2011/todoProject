package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java2connection {

	public static void main(String []args) {
		
		
		String url ="jdbc:oracle:thin:@localhost:1521:rohith";
		String user= "admin1";
		String password= "Apple123";
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to MicroSoft SQL Server");
		} catch (SQLException e) {
			System.out.println("OOPS, there is an error: ");
			
			e.printStackTrace();
		}
		
	}
}
