package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class App14 {
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
			
			PreparedStatement ps = conn.prepareStatement("select * from employee ");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println();
			System.out.println();
			System.out.println("Total columns : "+rsmd.getColumnCount());
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
			System.out.println();
			System.out.println("Column Name of 2nd column: "+rsmd.getColumnName(2));
			System.out.println("Column Type Name of 2nd column: "+rsmd.getColumnTypeName(2));
			System.out.println();
			System.out.println("Column Name of 3rd column: "+rsmd.getColumnName(3));
			System.out.println("Column Type Name of 3rd column: "+rsmd.getColumnTypeName(3));
			System.out.println();
			System.out.println("Column Name of 4th column: "+rsmd.getColumnName(4));
			System.out.println("Column Type Name of 4th column: "+rsmd.getColumnTypeName(4));
			System.out.println();
			
			conn.close();
			System.out.println();
			
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
