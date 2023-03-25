package com.jsapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App7 {
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
			System.out.println("Selecting Particular Records of given table... ");
			stmt = conn.createStatement();
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			
			//Extract records without any condition.
			System.out.println("Fetching records without condition. . . ");
			String sql = "Select id, firstname, lastname, age From Employee ";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				//Retrieve by column name
				int eid = rs.getInt("id");
				int eage = rs.getInt("age");
				String efirst = rs .getString("firstname");
				String elast = rs.getString("lastname");
				
				//Display values
				System.out.println();
				System.out.println("ID: "+eid);
				System.out.println(", Age: " + eage);
				System.out.println(", First-Name: " + efirst);
				System.out.println(", Last-Name: " + elast);
			}
			System.out.println();System.out.println();System.out.println();System.out.println();
			Thread.sleep(2000);
			
			
			System.out.println("Fetching records with condition. . . ");
			sql = "Select id, firstname, lastname, age From Employee"
					+" Where id = 102 ";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				//Retrieve by column name
				int eid = rs.getInt("id");
				int eage = rs.getInt("age");
				String efirst = rs .getString("firstname");
				String elast = rs.getString("lastname");
				
				//Display values
				System.out.println();
				System.out.println("ID: "+eid);
				System.out.println(", Age: " + eage);
				System.out.println(", First-Name: " + efirst);
				System.out.println(", Last-Name: " + elast);
			}
			rs.close();
			
			System.out.println();
			Thread.sleep(2000);
			System.out.println("Particular Record is Fetched. . . ");
			
			stmt.close();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed. . . ");
			
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
