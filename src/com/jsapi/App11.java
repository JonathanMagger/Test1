package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*Deleting database*/
public class App11 {
	//JDBC driver name and database URL
			static final String DB_URL = "jdbc:mysql://localhost:3306/myjavacode";
			//Database credentials
			static final String USER = "root";
			static final String PASS = "root";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//STEP 3 : open a connection
			System.out.println("Connecting to Database... ");
			conn = DriverManager.getConnection(DB_URL, USER,PASS);
			
			Thread.sleep(2000);
			System.out.println("Database is Connected ");
			stmt = conn.createStatement();
			
			Thread.sleep(2000);
			System.out.println("Deleting Database . . . ");
			System.out.println();
			
			String sql = "Drop Database Student";
			stmt.executeLargeUpdate(sql);
			Thread.sleep(2000);
			System.out.println("Database deleted successfully. . . ");
			
			stmt.close();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed.... ");
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
	}

}
}
