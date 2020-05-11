package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		

		String url ="jdbc:sqlserver://DESKTOP-5UM2NL8\\SQLEXPRESS;databaseName=med";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connected to MicroSoft SQL Server");
		} catch (SQLException e) {
			System.out.println("OOPS, there is an error: ");
			
			e.printStackTrace();
		}
		
	}

}
