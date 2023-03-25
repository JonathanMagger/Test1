package com.jsapi;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App15 {
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
			
			System.out.println();System.out.println();
			
			DatabaseMetaData dbmd = conn.getMetaData();
			
			System.out.println("Driver Name: "+dbmd.getDriverName());
			System.out.println("Driver Version: "+dbmd.getDriverVersion());
			System.out.println("UserName: "+dbmd.getUserName());
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
			
			conn.close();
			System.out.println();
			
			Thread.sleep(2000);
			System.out.println("Connection closed... ");
			
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
