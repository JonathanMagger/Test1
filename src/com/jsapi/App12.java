package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App12 {
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
			// Create statement object
			stmt = conn.createStatement();
			// Set auto-commit to false for batch
			conn.setAutoCommit(false);
			
			//Create SQL Statement
			String SQL1 ="Insert Into Employee (id, firstname, lastname, age) "+
						"Values (300, 'GHI', 'ATS', 40)";
			// Add above SQL statement in the batch
			stmt.addBatch(SQL1);
			
			//Create one more SQL Statement
			String SQL2 ="Insert Into Employee (id, firstname, lastname, age) "+
					"Values (301,'JKL', 'ATS', 45)";
			// Add above SQL statement in the batch
			stmt.addBatch(SQL2);
			
			//Create one more SQL Statement
			String SQL3 ="Update Employee Set age = 35 "+
						"Where id = 102";
			// Add above SQL statement in the batch
			stmt.addBatch(SQL3);
			
			// Create an int [] to hold returned values
			int [] count = stmt.executeBatch();
			
			//Explicity commit statements to apply changes
			conn.commit();
			System.out.println("Total Records Inserted is : "+ count);
			
			System.out.println();
			stmt.close();
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
