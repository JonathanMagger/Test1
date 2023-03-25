package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class App13 {
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
			
			// Create SQL Statement
			String SQL = "insert into Employee (id, firstname, lastname, age) "+
						"Values (?,?,?,?)";
			
			// Create PrepareStatement object
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			// Set auto-commit to false
			conn.setAutoCommit(false);
			
			// Set the variables
			pstmt.setInt(1, 401);
			pstmt.setString(2, "MNO");
			pstmt.setString(3, "ATS");
			pstmt.setInt(4, 33);	
			// Add it to the Batch
			pstmt.addBatch();
			
			// Set the variables
			pstmt.setInt(1, 402);
			pstmt.setString(2, "PQR");
			pstmt.setString(3, "ATS");
			pstmt.setInt(4, 31);	
			// Add it to the Batch
			pstmt.addBatch();
			
			// Set the variables
			pstmt.setInt(1, 403);
			pstmt.setString(2, "STU");
			pstmt.setString(3, "ATS");
			pstmt.setInt(4, 37);	
			// Add it to the Batch
			pstmt.addBatch();
			
			// add more batches
			
			//Create an int [] to hold returned values
			int [] count = pstmt.executeBatch();
			
			//Explicity commit statements to apply changes
			conn.commit();
			System.out.println("Total Records Inserted is : "+ count);
			
			System.out.println();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed.. ");
			
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
