package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//connection test
public class App1 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/myjavacode";
	static final String USER = "root";
	static final String PASS = "root";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			System.out.println("Connecting to Database... ");
			conn = DriverManager.getConnection(DB_URL, USER,PASS);
			System.out.println();
			Thread.sleep(2000);
			System.out.println("Data Base is Connected ");
			stmt = conn.createStatement();
			
			System.out.println();
			Thread.sleep(2000);
			System.out.println("Connection established..");
			
			stmt.close();
			conn.close();
			System.out.println();
			Thread.sleep(2000);
			System.out.println("Connection Closed.. ");
		
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
