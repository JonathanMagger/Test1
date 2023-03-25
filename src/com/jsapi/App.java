package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//database creator


public class App {
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	static final String USER = "root";
	static final String PASS = "root";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//Step 1 : Open a connection
			System.out.println("Connection to database..");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//Step 2 : Execute a query
			System.out.println("Creating database...");
			stmt = conn.createStatement();
			
			String sql = "CREATE DATABASE tes";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully");
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt!=null)
					stmt.close();
			}catch(SQLException se2) {
				//nothing we can do
			}try {
				if(conn!=null)
					conn.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}//end finally try
		}//end try
	}

}
