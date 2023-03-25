package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App3 {
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
			System.out.println("Inserting Records in given Table ... ");
			stmt = conn.createStatement();
			System.out.println();

			String sql ="INSERT INTO Employee " +
						"VALUES (101, 'ABC', 'ATS', 18)";
			stmt.executeUpdate(sql);
			
			System.out.println("Record - 1 is inserted . . . ");
			sql = "INSERT INTO Employee " + "VALUES (102, 'DEF', 'ATS', 25)";
			stmt.executeUpdate(sql);
			
			System.out.println("Record - 2 is inserted . . . ");
			sql = "INSERT INTO Employee " + "VALUES (103, 'GHI', 'ATS', 30)";
			stmt.executeUpdate(sql);
			
			System.out.println("Record - 3 is inserted . . . ");
			sql = "INSERT INTO Employee " + "VALUES (104, 'JKL', 'ATS', 28)";
			stmt.executeUpdate(sql);
			
			System.out.println("Record - 4 is inserted . . . ");
			
			System.out.println();
			Thread.sleep(2000);
			System.out.println("All Records are inserted in table");
			
			stmt.close();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed");
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt!=null)
					stmt.close();
			}catch(SQLException se2) {
			}//nothing we can do
			try {
				if(conn!=null)
					conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}//end finally try
		}//end try	
	}

}
