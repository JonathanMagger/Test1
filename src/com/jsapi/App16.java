package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// Image Storing Process
public class App16 {
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
			
			Thread.sleep(2000);
			//STEP 4 : Execute a query
			System.out.println("Creating Tables in given Database... ");
			stmt = conn.createStatement();
			
			String sql = "Create Table Myimage (Name Varchar(50), PHOTO BLOB)";
			
			stmt.executeUpdate(sql);
			Thread.sleep(2000);
			System.out.println("Myimage Table is Created database... ");
			
			stmt.close();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed..");
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2) {
			}//nothing we can do
			try {
				if (conn!=null)
					conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}//end finally try
		}//end try
	}

}
